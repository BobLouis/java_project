package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainPageCon {

	@FXML
	Label nameLabel;
	
	public void displayName(String username){
		System.out.println(username);
		
//		nameLabel.setText("Hello: ");
	}
	
}
