package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class control {
	
	@FXML

	
	public void up(ActionEvent e) {
		System.out.println("UP");
//		myCircle.setCenterY(
	}
	
	public void down(ActionEvent e) {
		System.out.println("DOWN");
//		myCircle.setCenterY(y++);
	}
	public void right(ActionEvent e) {
		System.out.println("RIGHT");
//		myCircle.setCenterX(x++);
		
	}
	public void left(ActionEvent e) {
		System.out.println("LEFT");
//		myCircle.setCenterX(x--);
	}
}
