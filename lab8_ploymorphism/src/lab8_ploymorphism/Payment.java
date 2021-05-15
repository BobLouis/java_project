package lab8_ploymorphism;

public class Payment {
	public  void pay() {
		System.out.println("Pay in cash");
	}
	
	public void checkout(){
		pay();
	}
}
