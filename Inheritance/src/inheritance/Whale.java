package inheritance;

public class Whale extends Poyuryu implements Swimable {
	Whale() {
		myClass = "Whale";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + "수영 중...");		
	}
}
