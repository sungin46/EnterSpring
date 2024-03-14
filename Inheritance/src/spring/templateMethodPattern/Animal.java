package spring.templateMethodPattern;

public abstract class Animal {
	//템플릿 메소드
	public void playWithOwner() {
		System.out.println("Come Come here!!");
		play();
		runSomething();
		System.out.println("Good boy;");
	}
	
	//추상메소드
	abstract void play();
	
	//Hook 메소드
	void runSomething() {
		System.out.println("돌격하는 멍냥이들");
	}
}
