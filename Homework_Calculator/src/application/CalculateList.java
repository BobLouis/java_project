package application;

import java.util.*;

public class CalculateList {
	public static String calculate(String eq) {
		//split the array
		LinkedList<Double> numArr = new LinkedList<>();
		LinkedList<Character> opArr = new LinkedList<>();
		int opIndex=0;
		double temp=0.0;
	    int ptr = 0;
	    char c;
	    
	    
	    System.out.println(eq);
	    while(eq.indexOf('+')>-1||eq.indexOf('-',1)>0||eq.indexOf('*')>-1||eq.indexOf('/')>-1) {
	    	for(int i=0;i<eq.length();++i) {
				c=eq.charAt(i);
				
				if(c=='+'||c=='*'||c=='/') {
					ptr=i;
					break;
				}
				if(c=='-') {
					if(i==0) 
						continue;
					else {
						ptr=i;
						break;
					}
				}
			}
		    System.out.println(eq.substring(0,ptr));
		    System.out.println(eq.charAt(ptr));
			numArr.add(Double.parseDouble(eq.substring(0,ptr)));
			opArr.add(eq.charAt(ptr));
			System.out.println(eq.substring(ptr+1,eq.length()));
			eq=eq.substring(ptr+1,eq.length());
			System.out.println(eq);
			System.out.println();
	    }
	    numArr.add(Double.parseDouble(eq));
	    
	    for(int i=0;i<opArr.size();++i){
	    	System.out.println(numArr.get(i));
	    	System.out.println(opArr.get(i));
	    }
	    System.out.println(numArr.get(numArr.size()-1));
	    System.out.println();
	    
	    while(opArr.indexOf('/')>-1) {
	    	opIndex=opArr.indexOf('/');
		    temp=proc(numArr.get(opIndex),numArr.get(opIndex+1),'/');
		    System.out.printf("temp: %f\n",temp);
		    opArr.remove(opIndex);
		    numArr.set(opIndex,temp);
		    numArr.remove(opIndex+1);
	    }
	    System.out.println("After divide");
	    for(int i=0;i<opArr.size();++i){
	    	System.out.println(numArr.get(i));
	    	System.out.println(opArr.get(i));
	    }
	    System.out.println(numArr.get(numArr.size()-1));
	    System.out.println();

	    

	    while(opArr.indexOf('*')>-1) {
	    	opIndex=opArr.indexOf('*');
		    temp=proc(numArr.get(opIndex),numArr.get(opIndex+1),'*');
		    System.out.printf("temp: %f\n",temp);
		    opArr.remove(opIndex);
		    numArr.set(opIndex,temp);
		    numArr.remove(opIndex+1);
	    }
	    System.out.println("After *");
	    for(int i=0;i<opArr.size();++i){
	    	System.out.println(numArr.get(i));
	    	System.out.println(opArr.get(i));
	    }
	    System.out.println(numArr.get(numArr.size()-1));
	    System.out.println();

	    while(opArr.indexOf('-')>-1) {
	    	opIndex=opArr.indexOf('-');
		    temp=proc(numArr.get(opIndex),numArr.get(opIndex+1),'-');
		    System.out.printf("temp: %f\n",temp);
		    opArr.remove(opIndex);
		    numArr.set(opIndex,temp);
		    numArr.remove(opIndex+1);
	    }
	    System.out.println("After -");
	    for(int i=0;i<opArr.size();++i){
	    	System.out.println(numArr.get(i));
	    	System.out.println(opArr.get(i));
	    }
	    System.out.println(numArr.get(numArr.size()-1));
	    System.out.println();
	    
	    while(opArr.indexOf('+')>-1) {
	    	opIndex=opArr.indexOf('+');
		    temp=proc(numArr.get(opIndex),numArr.get(opIndex+1),'+');
		    System.out.printf("temp: %f\n",temp);
		    opArr.remove(opIndex);
		    numArr.set(opIndex,temp);
		    numArr.remove(opIndex+1);
	    }
	    System.out.println("After +");
	    for(int i=0;i<opArr.size();++i){
	    	System.out.println(numArr.get(i));
	    	System.out.println(opArr.get(i));
	    }
	    System.out.println(numArr.get(0));
	    System.out.println();


	    temp=numArr.get(0);
	    
	    

	    
		return String.format("%.1f", temp);

	}
	
	private static double proc(double front ,double back,char op) {
		switch(op) {
		case '+':
			return front+back;
			
		case '-':
			return front-back;
			
		case '*':
			return front*back;
			
		case '/':
			return front/back;
			
		default:
			return 0;
		}
	}
	
}
