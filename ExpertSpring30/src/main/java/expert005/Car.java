package expert005;

import jakarta.annotation.Resource;

public class Car {
	//Autowired는 스프링을 사용하지 않으면 사용할 수 없지만 Resource는 자바 표준 어노테이션이다.
	//Autowired는 type이 우선
	//Resource는 id가 우선
	@Resource
	Tire tire;

	public String getTireBrand() {
		return "장착한 타이어 : " + tire.getBrand();
	}
}
