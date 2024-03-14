package spring.templateMethodPattern;

public class Dog extends Animal {
	//추상메소드 오버라이딩
	@Override
	void play() {
		System.out.println("왈왈왈왈 크르르르르르릉");
	}
	
	//훅 메소드 오버라이딩
	@Override
	void runSomething() {
		System.out.println("왈오라왈콸크르르르르...");		
	}
}
