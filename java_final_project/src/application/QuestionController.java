package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class QuestionController {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void nextQuestion(ActionEvent event ) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Question/Q1.fxml"));
		root = loader.load();

		NoticeController notice = loader.getController();
		

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
