package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class NoticeController {
	@FXML
	Label nameLabel;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void displayName(String username) {
		nameLabel.setText("Hello " + username+" please read the following info carefully");
	}
	
	public void start(ActionEvent event) throws IOException {
		System.out.println("start");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Question.fxml"));
		root = loader.load();

		QuestionController question = loader.getController();
		question.nextQuestion();

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
}
