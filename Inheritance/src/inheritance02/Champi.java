package inheritance02;

public class Champi extends Joryu implements Flyable {
	Champi() {
		myClass = "참새";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + "Flying...");
	}
}
