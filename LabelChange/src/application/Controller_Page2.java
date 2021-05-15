package application;



import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller_Page2 implements Initializable{
	
	@FXML
	public Label label ;
	
	
	public static Label static_label;
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle arg1) {
		System.out.println("in page2");
		label.setText("New");
		static_label=label;
	}
	
	
	
}
