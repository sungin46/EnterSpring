package spring.templateCallbackPatternRefactorying;

public class Client {
	//전략을 익명 내부 클래스로 구현한 전략 패턴
	public static void main(String[] args) {
		Soldier rambo = new Soldier();
		
		rambo.runContext("두두두두");
		
		System.out.println();

		rambo.runContext("울어라, 지옥참마도!!");
		
		System.out.println();

		rambo.runContext("엑스 엑스 엑스 찍어");
		
	}

}
