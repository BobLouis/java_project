package application;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class EndController {

	
	@FXML
	private Label scoreLabel;
	@FXML
	private CheckBox MacOsBox;
	@FXML
	private CheckBox WindowsBox;
	@FXML
	private Label cautionLabel;
	
	private int os = 0; //1->mac 2->window 
	
	public void setScore(double score) {
		scoreLabel.setText("Score: "+score);
	}
	
	
	@FXML
	private void handleMacbox() {
		if(MacOsBox.isSelected()) {
			os=1;
			WindowsBox.setSelected(false);
		} else {
			os = 0;
		}
		
	}
	
	@FXML
	private void handleWindowbox() {
		if(WindowsBox.isSelected()) {
			os = 2;
			MacOsBox.setSelected(false);
		} else {
			os = 0;
		}
	}
	
	@FXML
	private void finishButton() {
		if(os == 0) {
			cautionLabel.setText("Please select your operating system");
		} else {
			cautionLabel.setText(" ");
		}
	}
}
