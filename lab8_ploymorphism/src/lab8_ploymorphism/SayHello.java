package lab8_ploymorphism;

public class SayHello {
	public String sayHello(String name) {
		return "hello"+name;
	}
	
	public String sayHello(String name,String gender) {
		if(gender.equals("Boy")){
			return "hello! Mr. "+ name;
		}
		else if(gender.equals("boy")) {
			return "Hello! Ms."+name; 
		}else {
			return "hello "+name; 
		}
	}
	
	
	public static void main(String[] args) {
		SayHello hello=new SayHello();
		System.out.println(hello.sayHello("BobLouis"));		//decided at compile time
		System.out.println(hello.sayHello("BobLouis,boy")); //decided at compile time
	}
}
