package staticBlock;

public class Driver04 {

	public static void main(String[] args) {
		//Animal 클래스의 인스턴스를 여러개 선언해도 한번만 작동한다.
		System.out.println("main 메소드 시작");
		Animal pororo = new Animal();
		Animal picachu = new Animal();
	}

}
