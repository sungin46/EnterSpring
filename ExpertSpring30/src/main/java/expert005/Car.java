package expert005;

import jakarta.annotation.Resource;

public class Car {
	@Resource
	Tire tire;

	public String getTireBrand() {
		return "장착한 타이어 : " + tire.getBrand();
	}
}
