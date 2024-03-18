package expert001_02;

public class Car {
	Tire tire;
	
	//new로 생성하지 않고 생성자에 인자가 추가됨.
	public Car(Tire tire) {
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착한 타이어 : " + tire.getBrand();
	}
}
