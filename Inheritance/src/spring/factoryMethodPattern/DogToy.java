package spring.factoryMethodPattern;

//팩토리 메소드가 생성할 객체
public class DogToy extends AnimalToy {
	public void identify() {
		System.out.println("Tennis ball.");
	}
}
