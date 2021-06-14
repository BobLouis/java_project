package application;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LoginController {
	@FXML
	TextField nameTextField;
	@FXML
	TextField passwordTextField;
	@FXML
	Label warningLabel;
	
	private Stage stage;
	private Scene scene;
	private Parent root;

	private final static int userNum = 10;
	private int userExist = -1;
	private boolean IdCorr = false;
	private static String userId = null; 
	
	public void login(ActionEvent event) throws IOException {
		ExcelReader rc=new ExcelReader();
		Student [] student = new Student[10];
		for(int i=0;i<10;++i) {
			student[i] = new Student(rc.getName(i),rc.getId(i));
		}
		userExist = -1;
		IdCorr = false;
		String username = nameTextField.getText();
		String Id = passwordTextField.getText();
		
		for (int i=0;i<10;++i) {
			if(username.equals(student[i].getName())) {
				userExist = i;
			}
		}
		
		if (userExist > -1) {
			//user exist check the Id is correct
			IdCorr = student[userExist].getId().equals(Id);
			if(IdCorr == true)
				userId = student[userExist].getId();
		}
		System.out.println("user log: "+userExist);
		System.out.println("id: "+IdCorr);
		if(userExist == -1) {
			warningLabel.setText("user not exist!!");
		}
		if(userExist > -1 && IdCorr == false) {
			warningLabel.setText("student Id incorrect. Please try again");
		}
		
		
		if(IdCorr) {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Notice.fxml"));
			root = loader.load();

			NoticeController notice = loader.getController();
			notice.displayName(username);

			stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	public static String getId() {
		return userId;
	}
}
