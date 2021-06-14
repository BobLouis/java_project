package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

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
	private double score = 0;
	public void setScore(double score) {
		scoreLabel.setText("Score: "+score);
		this.score = score;
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
		String Id = LoginController.getId();
		System.out.println(Id+"_"+score);
		Encode code = new Encode();
		String encode = code.encode(Id+"_"+score);
//		String decode = code.decode(encode);
//		System.out.println(encode);
//		System.out.println(decode);
		if(os == 0) {
			cautionLabel.setText("Please select your operating system");
		} else {
			cautionLabel.setText(" ");
			if (os == 1) {
				//mac path
				try {
					File writename = new File(System.getProperty("user.home") + "/Desktop/"+Id+".txt"); 
					writename.createNewFile(); 
					BufferedWriter out = new BufferedWriter(new FileWriter(writename));
					out.write(encode); 
					out.flush(); 
					out.close();  
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (os == 2){
				//window path
				try {
					File writename = new File(System.getProperty("user.home") + "/Desktop/output.txt"); 
					writename.createNewFile(); 
					BufferedWriter out = new BufferedWriter(new FileWriter(writename));
					out.write(encode); 
					out.flush(); 
					out.close(); 
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
