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

	private Stage stage;
	private Scene scene;
	private Parent root;

	public void login(ActionEvent event) throws IOException {
		ExcelReader rc=new ExcelReader();
		Student [] student = new Student[10];
		student[0] = new Student("wqe","qwe");
//		for(int i=0;i<10;++i) {
//			student[i].setName(rc.getName(i+1));
//			student[i].setId(rc.getId(i+1));
//		}
		System.out.println(rc.getId(1));
		System.out.println(rc.getName(1));
		String username = nameTextField.getText();
		String password = passwordTextField.getText();

		// write file
		try {
			PrintWriter writer = new PrintWriter(new FileOutputStream(
					"/Users/kounuki/eclipse-workspace/java_final_project/src/Resources/account.txt", true));
			writer.println(username);
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//read file
		

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
