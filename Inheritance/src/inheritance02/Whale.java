package inheritance02;

public class Whale extends Poyuryu implements Swimable{
	Whale(){
		myClass = "고래";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + "Swimming...");
	}
}
