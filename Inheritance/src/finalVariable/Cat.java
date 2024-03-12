package finalVariable;

//변수에 final이 붙었다면??
public class Cat {
	final static int staticInt1 = 1;
	final static int staticInt2;
	
	final int objInt1 = 1;
	final int objInt2;
	
	static {
		staticInt2 = 2;
		
		//상수는 한 번 초기화되면 값을 변경할 수 없다.
		//staticInt2 = 4;
	}
	
	Cat() {
		objInt2 = 2;
		
		//상수는 한 번 초기화되면 값을 변경할 수 없다.
		//objInt2 = 4;
		
		final int localInt1 = 1;
		final int localInt2;
		
		localInt2 = 2;
	}
	
	//변수에 final이 붙으면 변경할 수 없는 상수가 된다.
	//정적 상수는 선언 시, static 블록 내에서 초기화 가능. 이후는 변경 불가.
	//객체 상수는 선언 시, 객체 생성자 혹은 인스턴스 블록에서 초기화 가능. 이후에는 변경 불가.
}
