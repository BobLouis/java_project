package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NoticeController {
	@FXML
	Label nameLabel;
	
	public void displayName(String username) {
		nameLabel.setText("Hello " + username+" please read the following info carefully");
	}
	
	public void start(ActionEvent event) throws IOException {
		System.out.println("start");
		
		QuestionController q = new QuestionController();
		q.nextQuestion(event);
	}
}
