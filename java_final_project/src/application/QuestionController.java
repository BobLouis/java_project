package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class QuestionController {
	
	@FXML
	private Label    Qnumber;
	@FXML
	private TextArea Qarea;
	@FXML
	private CheckBox Abox;
	@FXML
	private CheckBox Bbox;
	@FXML
	private CheckBox Cbox;
	@FXML
	private CheckBox Dbox;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//question[i][0] = question 
	//question[i][1~4] = option ABCD
	String[][] question = {
			//file io
			{"An __________ allows data to flow into your program.","input stream","output stream","file name","all of the above"},
			{"An __________ allows data to flow from your program.","input stream","output stream","file name","all of the above"},
			{"The method __________ from the File class forces a physical write to the file of any data that is buffered.","close()","writeUTF()","flush()","writeObject()"},
			{"The stream that is automatically available to your Java code is:","System.in","System.out","System.err","all of the above"},
			//javaFX
			{"A JavaFX action event handler is an instance of _______.","ActionEvent","Action","EventHandler","EventHandler<ActionEvent>"},
			{"A JavaFX action event handler contains a method ________.","public void actionPerformed(ActionEvent e)","public void action Performed(Event e)","public void handle(ActionEvent e)","public void handle(Event e)"},
			{"A JavaFX event handler for event type T is an instance of _______.","ActionEvent","Action","EventHandler","EventHandler<T>"},
			//polymorphism
			{"A class that uses an interface must use the keyword:","Extends","Inherits","Super","Implements"},
			{"An interface and all of its methods headings are normally declared to be","public","private","protected","package access"},
			{"An interface may contain","instance variable","primitive variables","constant variables","all of the above"},
			//inheritance
			{"The class _______ is an ancestor class of all Java classes","String","Object","Math","JFrame"},
			{"If an instance variable is not modified by public,protected or private then it is said to have:","package access","default access","friendly access","all of the above"},
			{"A super class is also called a","derived class","dominant class","sub class","base class"},
			
	};
	
	int[] answer = {1,2,3,4  ,4,3,4 ,4,1,3 ,2,2,4};
	
	private int Qall = answer.length;
	private int Qcount = 0;
	
	
	public void nextQuestion(ActionEvent event) throws IOException {
		if(Qcount>=Qall) {
			end(event);
		}
		Qnumber.setText("Question "+(++Qcount)+"/"+(Qall));
		if(Qcount<Qall) {
			Qarea.setText(question[Qcount-1][0]);
			Abox.setText(question[Qcount-1][1]);
			Bbox.setText(question[Qcount-1][2]);
			Cbox.setText(question[Qcount-1][3]);
			Dbox.setText(question[Qcount-1][4]);
		}
	}
	
	private void end(ActionEvent event) throws IOException {
		System.out.println("end");
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("End.fxml"));
		root = loader.load();
		EndController end = loader.getController();
		end.setScore(90.0);

		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	@FXML
	private void handleAbox() {
		if(Abox.isSelected()) {
			Bbox.setSelected(false);
			Cbox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleBbox() {
		if(Bbox.isSelected()) {
			Abox.setSelected(false);
			Cbox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleCbox() {
		if(Cbox.isSelected()) {
			Bbox.setSelected(false);
			Abox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleDbox() {
		if(Dbox.isSelected()) {
			Bbox.setSelected(false);
			Cbox.setSelected(false);
			Abox.setSelected(false);
		}
	}
	
	
	

}
