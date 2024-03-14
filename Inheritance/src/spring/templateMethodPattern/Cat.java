package spring.templateMethodPattern;

public class Cat extends Animal {
	//추상메소드 오버라이딩
	@Override
	void play() {
		System.out.println("미야아아아아아아옹!");
	}
	
	//훅 메소드 오버라이딩
	@Override
	void runSomething() {
		System.out.println("샤아아아아앗!!!");
	}
}
