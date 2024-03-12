package interface01;

//interface는 추상 메소드와 정적 상수만 가질 수 있기 때문에
//따로 메소드에 public, abstract를, 속성에 public, static, final을 붙이지 않아도 된다.
//자바에서 자동으로 붙여준다.
//하지만 명확하게 알아볼 수 있도록 인터페이스 기본 규칙을 적어주자.
interface Speakable {
	public static final double PI = 3.141592;
	public static final double absoluteZeroPoint = -275.15;
	
	public abstract void sayYes();
}

class Speaker implements Speakable {
	public void sayYes() {
		System.out.println("Say Yes!!!!");
	}
}

public class Driver {

	public static void main(String[] args) {
		System.out.println(Speakable.absoluteZeroPoint);
		System.out.println(Speakable.PI);
		
		Speaker reporter1 = new Speaker();
		reporter1.sayYes();
	}
	
	//아래 테스트 코드는 변수가 모두 static final 변수이므로 오류 발생.
//	public static void test() {
//		Speakable.PI = 3.14;
//		
//		Speakable.absoluteZeroPoint = -275.0;
//	}

}
