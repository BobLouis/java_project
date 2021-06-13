package application;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

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
	@FXML
	private Label    Caution;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//question[i][0] = question 
	//question[i][1~4] = option ABCD
	String[][] question = {
			//file io
			{"An __________ allows data to flow into your program.","input stream","output stream","file name","all of the above"},
			{"An __________ allows data to flow from your program.","input stream","output stream","file name","all of the above"},
			{"The method __________ from the File class forces a \nphysical write to the file of any data that is buffered.","close()","writeUTF()","flush()","writeObject()"},
			{"The stream that is automatically available to your \nJava code is:","System.in","System.out","System.err","all of the above"},
			//javaFX
			{"A JavaFX action event handler is an \ninstance of _______.","ActionEvent","Action","EventHandler","EventHandler<ActionEvent>"},
			{"A JavaFX action event handler contains\n a method ________.","public void actionPerformed(ActionEvent e)","public void action Performed(Event e)","public void handle(ActionEvent e)","public void handle(Event e)"},
			{"A JavaFX event handler for event type T\n is an instance of _______.","ActionEvent","Action","EventHandler","EventHandler<T>"},
			//polymorphism
			{"A class that uses an interface must use\n the keyword:","Extends","Inherits","Super","Implements"},
			{"An interface and all of its methods headings \nare normally declared to be","public","private","protected","package access"},
			{"An interface may contain","instance variable","primitive variables","constant variables","all of the above"},
			//inheritance
			{"The class _______ is an ancestor class of all \nJava classes","String","Object","Math","JFrame"},
			{"If an instance variable is not modified by\n public,protected or private then it is said to have:","package access","default access","friendly access","all of the above"},
			{"A super class is also called a","derived class","dominant class","sub class","base class"},
			
	};
	
	int[] answer = {1,2,3,4  ,4,3,4 ,4,1,3 ,2,2,4};
	private int Qall = answer.length;
	private int Qcount = 0;
	int inputOption = 0;
	int inputOptionArr[] = new int[Qall];
	int questionOrder[]  = new int[Qall];
	int answerInOrder[]  = new int[Qall]; 
	private boolean isStart = true;
		
	
	public void nextQuestion(ActionEvent event) throws IOException {
		//check if the option is selected
		if(inputOption>0 || isStart==true) {
			++Qcount;
			
			if(isStart)
				orderGenerate();
			//save the previous option
			if(!isStart)
				inputOptionArr[Qcount-2]=inputOption;
			inputOption = 0;  //reset the inputOption 0-> no input
			Caution.setText("");
			if(Qcount>Qall) {
				System.out.println("");
				for(int i=0;i<Qall;++i)
					System.out.print(inputOptionArr[i]+"");
				
				
				end(event);
			}
			//reset all the option
			Abox.setSelected(false);
			Bbox.setSelected(false);
			Cbox.setSelected(false);
			Dbox.setSelected(false);

			Qnumber.setText("Question "+(Qcount)+"/"+(Qall));
			if(Qcount<Qall) {
				Qarea.setText(question[questionOrder[Qcount-1]][0]);
				Abox.setText (question[questionOrder[Qcount-1]][1]);
				Bbox.setText (question[questionOrder[Qcount-1]][2]);
				Cbox.setText (question[questionOrder[Qcount-1]][3]);
				Dbox.setText (question[questionOrder[Qcount-1]][4]);
			}
			isStart = false;
		}else {
			Caution.setText("Please choose a option");
			System.out.println("Please choose a option");
		}
		
	}
	
	private void orderGenerate() {
		for(int i=0;i<Qall;++i) {
			questionOrder[i]=i;
		}
		int position = 0;
		int temp = 0;
		
		Random rgen = new Random();  // Random number generator		
		for(int i=0;i<Qall;++i) {
			position = rgen.nextInt(Qall);
			temp = questionOrder[i];
			questionOrder[i] = questionOrder[position];
			questionOrder[position] = temp;
		}
		System.out.println("");
		for(int i=0;i<Qall;++i)
			System.out.print(questionOrder[i]+" ");
	}
	
//	private void score() {
//		for(int i=0;i<Qall;++i) {
//			answerInOrder[i] = 
//		}
//			
//	}
	
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
			inputOption=1;
			Bbox.setSelected(false);
			Cbox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleBbox() {
		if(Bbox.isSelected()) {
			inputOption=2;
			Abox.setSelected(false);
			Cbox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleCbox() {
		if(Cbox.isSelected()) {
			inputOption=3;
			Bbox.setSelected(false);
			Abox.setSelected(false);
			Dbox.setSelected(false);
		}
	}
	
	@FXML
	private void handleDbox() {
		if(Dbox.isSelected()) {
			inputOption=4;
			Bbox.setSelected(false);
			Cbox.setSelected(false);
			Abox.setSelected(false);
		}
	}
	
}
