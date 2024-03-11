package inheritance;

public class Champi extends Joryu implements Flyable{
	Champi(){
		myClass = "Champi";
	}
	
	@Override
	public void fly() {
		System.out.println(myClass + "나는 중....");
	}
}
