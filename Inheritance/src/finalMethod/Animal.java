package finalMethod;

//final이 붙으면 오버라이딩도 금지된다.
public class Animal {
	final void breath() {
		System.out.println("Breathing...");
	}
}

class Poyuryu extends Animal {
	//Cannot override the final method from Animal
//	void breath() {
//		System.out.println("breathing....");
//	}
}