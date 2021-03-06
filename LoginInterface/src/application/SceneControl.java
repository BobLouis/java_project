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

public class SceneControl {
	
	@FXML
	TextField usernameField;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void login(ActionEvent event) throws IOException{
		
		String username= usernameField.getText();
		System.out.println(username);
		
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("MainPage.fxml"));
		root = loader.load();
		
		MainPageCon main = loader.getController();
		main.displayName(username);
//		Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
		
	}
//	public void up(ActionEvent e) {
//		System.out.println("UP");
//	}
//	
//	public void down(ActionEvent e) {
//		System.out.println("DOWN");
//	}
//	public void right(ActionEvent e) {
//		System.out.println("RIGHT");
//		
//	}
//	public void left(ActionEvent e) {
//		System.out.println("LEFT");
//
//	}
}

		
		
	


