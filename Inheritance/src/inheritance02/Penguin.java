package inheritance02;

public class Penguin extends Poyuryu implements Swimable {
	Penguin(){
		myClass = "펭귄";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + "Swimming...");
	}
}
