package application;



public class Calculate {
	private static int front=0;
	private static int back=0;
	private static String frontStr;
	private static String backStr;
	private static String subStr;
	
	public static String calculate(String equation) {
		int index;
		while((index=equation.indexOf('*',1))>0) {
			equationToken(equation,index);
	        equation.replace(subStr, multiple(frontStr,backStr));
		}
		while((index=equation.indexOf('/',1))>0) {
			equationToken(equation,index);
	        equation.replace(subStr, divide(frontStr,backStr));
		}
		while((index=equation.indexOf('+',1))>0) {
			equationToken(equation,index);
	        equation.replace(subStr, plus(frontStr,backStr));
		}
		while((index=equation.indexOf('-',1))>0) {
			
			equationToken(equation,index);
	        equation.replace(subStr, multiple(frontStr,backStr));
		}
        
        
        
		
		
		return equation;
    }
	
	private static void equationToken(String equation,int index){
		char c ;
		for(int i=(index-1);i>0;--i) {
			c=equation.charAt(i);
			if(c=='+'||c=='*'||c=='/') {
				front=(i+1);
				break;
			}
			if(c=='-') {
				if(equation.charAt(i-1)=='+'||equation.charAt(i-1)=='-'||equation.charAt(i-1)=='*'||equation.charAt(i-1)=='/') {
					front = i;
					break;
				}
			}
		}
		
		for(int i=(index+1);i<equation.length();++i) {
			c=equation.charAt(i);
			
			if(c=='+'||c=='*'||c=='/') {
				back=(i-1);
				break;
			}
			if(c=='-') {
				if(i==index+1) 
					continue;
				else {
					back=(i-1);
					break;
				}
			}
		}
		
		frontStr=equation.substring(front,index);
		backStr =equation.substring(index+1,back+1);
		subStr  =equation.substring(front,back+1);
		
	}
	
	private static String multiple(String front ,String back) {
		double num1=Double.parseDouble(front);
		double num2=Double.parseDouble(back);
		return  Double.toString(num1*num2);
	}
	
	private static String divide(String front ,String back) {
		double num1=Double.parseDouble(front);
		double num2=Double.parseDouble(back);
		return  Double.toString(num1/num2);
	}
	
	private static String plus(String front ,String back) {
		double num1=Double.parseDouble(front);
		double num2=Double.parseDouble(back);
		return  Double.toString(num1+num2);
	}
	
	private static String minus(String front ,String back) {
		double num1=Double.parseDouble(front);
		double num2=Double.parseDouble(back);
		return  Double.toString(num1-num2);
	}
	
	
	public static void main(String[] args) {
//		System.out.println(multiple("23.45","3.23"));
//		System.out.println("*123".indexOf('*') );
		
		String str = "12+-13/-123+123";
		
		int index =str.indexOf('/');
		equationToken(str,index);
		System.out.printf("%d %d\n",front,back);
		System.out.println(frontStr);
		System.out.println(backStr);
		System.out.println(subStr);
		System.out.println(divide(frontStr,backStr));
		System.out.println(str.indexOf('s'));
//		System.out.println(calculate)
	}
	
	
	
	
}
