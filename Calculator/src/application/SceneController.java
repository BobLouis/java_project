package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController {

	@FXML
	Label displayLabel;
	
	public void displayName(){
//		System.out.println(username);
		
		displayLabel.setText("Hello World" );
	}
	
}