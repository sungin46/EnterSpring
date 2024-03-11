package inheritance02;

public class Bat extends Poyuryu implements Flyable{
	Bat(){
		myClass = "박쥐";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + "Flying...");
	}
}
