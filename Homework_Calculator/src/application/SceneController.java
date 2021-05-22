package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SceneController {

	@FXML
	Label displayLabel;
	private String display = "";
	
	
	@FXML
	Label resultLabel ;
	private String result = "";
	
	private double num1;
	private double num2;
	
	private static boolean error=false;
	public void zero(){
		if(!(result.length()==1&&result.charAt(0)=='0')&&!(result.length()==2&&result.charAt(1)=='0'&&result.charAt(0)=='-')){
			System.out.println("0");
			
			result+="0";
			resultLabel.setText(result);
		}
		
		
	}
	
	public void one(){
		System.out.println("1");
		
		result+="1";
		resultLabel.setText(result);
		
	}
	
	public void two(){
		System.out.println("2");
		
		result+="2";
		resultLabel.setText(result);
		
	}
	
	public void three(){
		System.out.println("3");
		
		
		result+="3";
		resultLabel.setText(result);
	}
	
	public void four(){
		System.out.println("4");
		
		
		result+="4";
		resultLabel.setText(result);
	}
	
	public void five(){
		System.out.println("5");
		
		
		result+="5";
		resultLabel.setText(result);
	}
	
	public void six(){
		System.out.println("6");
		
		
		result+="6";
		resultLabel.setText(result);
	}
	
	public void seven(){
		System.out.println("7");
		
		
		result+="7";
		resultLabel.setText(result);
	}
	
	public void eight(){
		System.out.println("8");
		
		
		result+="8";
		resultLabel.setText(result);
	}
	
	public void nine(){
		System.out.println("9");
		
		
		result+="9";
		resultLabel.setText(result);
	}
	
	public void dot() {
		System.out.println(".");
		if(!(result.indexOf('.')>-1)) {
			if(result.length()==0) {
				result="0.";
				resultLabel.setText(result);
			}else {
				result+=".";
				resultLabel.setText(result);
			}
			
		}
		
	}
	
	public void divide() {
		if(!result.isEmpty()&&result.charAt(result.length()-1)!='-') {
			System.out.println("/");
			display+=result;
			display+="/";
			displayLabel.setText(display);
			
			result = "";
			resultLabel.setText(result);
		}
		
		
	}
	
	public void mutiple() {
		if(!result.isEmpty()&&result.charAt(result.length()-1)!='-') {
			System.out.println("*");
			display+=result;
			display+="*";
			displayLabel.setText(display);
			
			result = "";
			resultLabel.setText(result);
		}
		
	}
	
	
	public void plus() {
		if(!result.isEmpty()&&result.charAt(result.length()-1)!='-') {
			display+=result;
			display+="+";
			displayLabel.setText(display);
			
			result = "";
			resultLabel.setText(result);
		}
		
	}
	
	public void minus() {
		if(result.isEmpty()==false&&result.charAt(result.length()-1)=='-')
			return;
		if(result.isEmpty()) {
			result="-";
			resultLabel.setText(result);
			
		}else {
			display+=result;
			display+="-";
			displayLabel.setText(display);
			
			result = "";
			resultLabel.setText(result);
		}
		
	}
	
	
	public void equal() {
		CalculateList cal= new CalculateList();
		display+=result;
		result =cal.calculate(display);
		System.out.println(result);
		if(result.equals("Infinity")) {
			result="Error";
			System.out.println("in");
		}
			
		displayLabel.setText(display);
		resultLabel.setText(result);
	}
	
	public void backspace() {
		
		if(!result.isEmpty()) {
			System.out.println("re<-");
			result=result.substring(0, result.length() - 1);
			resultLabel.setText(result);
		}else {
			if(!display.isEmpty()) {
				System.out.println("di<-");
				display=display.substring(0,display.length()-1);
				displayLabel.setText(display);
			}

		}
				
		
	}
	
	public void clearEntry() {
		System.out.println("CE");
		
		result="";
		resultLabel.setText(result);
	}
	
	public void clearAll() {
		System.out.println("AC");
		display="";
		displayLabel.setText(display);
		
		
		result="";
		resultLabel.setText(result);
	}
	
	
	
	public static String removeLastChar(String s) {
	    return (s == null || s.length() == 0)
	      ? null 
	      : (s.substring(0, s.length() - 1));
	}
	
	public static boolean isLastOper(String s) {
		if(s.charAt(s.length()-1)=='+' || s.charAt(s.length()-1)=='-'||s.charAt(s.length()-1)=='*'||s.charAt(s.length()-1)=='/') {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}