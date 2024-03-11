package inheritance;

public class Penguine extends Poyuryu implements Swimable{
	Penguine(){
		myClass = "Penguine";
	}
	
	@Override
	public void swim() {
		System.out.println(myClass + "헤엄치는 중...");
	}
	
}
