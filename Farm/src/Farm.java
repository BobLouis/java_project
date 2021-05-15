class Duck{
	private boolean canfly=false;
	
	public Duck(boolean canfly) {
		this.canfly=canfly;
	}
	
	public boolean getCanfly() {
		return canfly;
	}
	
	public void quack() {
		System.out.println("quack!");
	}
	
	public void quack(String sound) {
		System.out.println(sound);
	}
	
	public String eat (String food) {
		String message = "Thank you! The "+food + " is good!";
		return message;
	}
	
	public void swim(int distance) {
		distance = distance -1;
		System.out.println("The distance of my swimming is "+distance);
	
	}
}


public class Farm {
	public static void main(String[] args) {
		Duck duck = new Duck(true);
		
		boolean canTheDuckFly=duck.getCanfly();
		if(canTheDuckFly ==true) {
			System.out.println("The duck can fly");
		}
		duck.quack();
		duck.quack("Ga Ga Ga");
		
		String food = "ham";
		String message = duck.eat(food);
		System.out.println(message);
		
		int expectationDistance=10;
		duck.swim(expectationDistance);
		System.out.println("The expected distance is "+ expectationDistance);
	}
}
