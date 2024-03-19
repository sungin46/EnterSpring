package expert004;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
	Tire tire;

	//Autowired를 사용해서 get, set을 사용할 필요가 없어짐
//	public Tire getTire() {
//		return tire;
//	}

//	public void setTire(Tire tire) {
//		this.tire = tire;
//	}
	
	public String getTireBrand() {
		return "장착한 타이어 : " + tire.getBrand();
	}
}
