package instanceOf01;

class Animal {
	
}

class Joryu extends Animal {
	
}

class Penguin extends Joryu {
	
}

public class Driver {

	public static void main(String[] args) {
		Animal animalObj = new Animal();
		Joryu joryuObj = new Joryu();
		Penguin penguinObj = new Penguin();
		
		System.out.println(animalObj instanceof Animal);
		
		System.out.println(joryuObj instanceof Animal);
		System.out.println(joryuObj instanceof Joryu);
		
		System.out.println(penguinObj instanceof Animal);
		System.out.println(penguinObj instanceof Joryu);
		System.out.println(penguinObj instanceof Penguin);
		
		System.out.println(penguinObj instanceof Object);
	}

}
