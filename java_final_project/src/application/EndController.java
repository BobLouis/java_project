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
			if (os == 1) {
				//mac path
				try {
					File writename = new File(System.getProperty("user.home") + "/Desktop/output.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
					writename.createNewFile(); // 建立新檔案
					BufferedWriter out = new BufferedWriter(new FileWriter(writename));
					out.write("我會寫入檔案啦\r\n"); // \r\n即為換行
					out.flush(); // 把快取區內容壓入檔案
					out.close(); // 最後記得關閉檔案
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else if (os == 2){
				//window path
				try {
					File writename = new File(System.getProperty("user.home") + "/Desktop/output.txt"); // 相對路徑，如果沒有則要建立一個新的output。txt檔案
					writename.createNewFile(); // 建立新檔案
					BufferedWriter out = new BufferedWriter(new FileWriter(writename));
					out.write("我會寫入檔案啦\r\n"); // \r\n即為換行
					out.flush(); // 把快取區內容壓入檔案
					out.close(); // 最後記得關閉檔案
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
