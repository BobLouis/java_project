package lab8_ploymorphism;

public class Store {
	public static void main(String[] as) {
		Payment p1 = new Payment();
		p1.checkout();
		payProcess(p1);
		
		Payment p2 = new CreditCardPayment();
		((CreditCardPayment)p2).sign();
		
		payProcess(p2);
	}
	
	public static void payProcess (Payment p) {
		if(p instanceof CreditCardPayment) {
			
			((CreditCardPayment)p).sign();
		}
	}
}
