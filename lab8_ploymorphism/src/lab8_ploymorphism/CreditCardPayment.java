package lab8_ploymorphism;

public class CreditCardPayment extends Payment{
	public int a=13;
	public void pay() {
		System.out.println("Pay with credit card");
	}
	
	public void sign() {
		System.out.println("Signing...");
	}
}
