package Super;

class Animal {
	void method() {
		System.out.println("Animal");
	}
}

class Joryu extends Animal {
	void method() {
		super.method();
		System.out.println("Joryu");
	}
}

class Penguin extends Joryu {
	void method() {
		super.method();
		System.out.println("Penguin");
		
//		super.super.method();
	}
}

public class Driver {

	public static void main(String[] args) {
		Penguin pororo = new Penguin();
		pororo.method();
	}

}
