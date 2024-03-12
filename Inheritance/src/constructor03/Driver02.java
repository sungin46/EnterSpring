package constructor03;

public class Driver02 {
	public static void main(String[] args) {
		Animal pororo = new Animal("Pororo");
		
		//인자가 있는 생성자를 하나라도 만들면 자바는 기본 생성자를 만들어주지 않는다.
		//Animal who = new Animal();
	}
}
