package instanceOf03;

//인터페이스 구현 관계에서도 동일하게 instanceof를 사용할 수 있다.

interface flyable {
	
}

class Bat implements flyable{
	
}

class Sparrow implements flyable {
	
}

public class Driver {

	public static void main(String[] args) {
		flyable batObj = new Bat();
		flyable sparrowObj = new Sparrow();
		
		System.out.println(batObj instanceof flyable);
		System.out.println(batObj instanceof Bat);
		
		System.out.println(sparrowObj instanceof flyable);
		System.out.println(sparrowObj instanceof Sparrow);
	}

}
