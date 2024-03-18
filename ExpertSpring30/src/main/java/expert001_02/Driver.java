package expert001_02;

public class Driver {

	public static void main(String[] args) {
		//new를 통해 타이어를 생산하는 코드가 이곳으로 이동
		//그리고 생성된 객체 변수를 Car에 인자로 넘겨준다.
		Tire tire = new KoreaTire();
		//Tire tire = new AmericaTire();
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
	}

}
