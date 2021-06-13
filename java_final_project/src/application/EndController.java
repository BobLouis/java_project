package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class EndController {

	
	@FXML
	private Label scoreLabel;
	
	public void setScore(double score) {
		scoreLabel.setText("Score: "+score);
	}
	
}
