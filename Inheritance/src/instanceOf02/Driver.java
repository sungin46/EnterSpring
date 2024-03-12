package instanceOf02;

class Animal {
	
}

class Joryu extends Animal {
	
}

class Penguin extends Joryu {
	
}
public class Driver {

	public static void main(String[] args) {
		//객체 참조 변수의 타입이 아닌 실체 타입에 의해 처리하기 때문에 모두 true가 나온다.
		Animal animalObj = new Animal();
		Animal joryuObj = new Joryu();
		Animal penguinObj = new Penguin();
		
		System.out.println(animalObj instanceof Animal);
		
		System.out.println(joryuObj instanceof Animal);
		System.out.println(joryuObj instanceof Joryu);
		
		System.out.println(penguinObj instanceof Animal);
		System.out.println(penguinObj instanceof Joryu);
		System.out.println(penguinObj instanceof Penguin);
		
		System.out.println(penguinObj instanceof Object);
	}

}
