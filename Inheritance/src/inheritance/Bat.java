package inheritance;

public class Bat extends Poyuryu implements Flyable {
	Bat(){
		myClass = "Bat";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + "나는 중...");
	}
}
