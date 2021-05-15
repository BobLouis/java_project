//package application;
//
//import java.io.IOException;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//
//public class Scene1Controller {
//
//	@FXML
//	TextField nameTextField;
//	
//	private Stage stage;
//	private Scene scene;
//	private Parent root;
//	
//	public void login(ActionEvent event) throws IOException {
//		
//		String username = nameTextField.getText();
//		
//		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));	
//		root = loader.load();	
//		
//		Scene2Controller scene2Controller = loader.getController();
//		scene2Controller.displayName(username);
//		
//		//root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));	
//		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//		scene = new Scene(root);
//		stage.setScene(scene);
//		stage.show();
//
//		
//	}
//}


package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Scene1Controller {
	
	@FXML
	TextField nameTextField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException{
		
		String username= nameTextField.getText();
		System.out.println(username);
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
		root = loader.load();
		
		Scene2Controller main = loader.getController();
		main.displayName(username);
//		Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
		
	}

}

		
		
	


