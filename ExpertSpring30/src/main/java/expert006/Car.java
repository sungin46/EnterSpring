package expert006;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
//	@Resource
//	@Resource(name="tire1")
//	@Autowired
	//Qulifier를 사용할 경우
//	@Qualifier("tire1")
	@Resource(name="tire")
	Tire tire;

	public String getTireBrand() {
		return "장착한 타이어 : " + tire.getBrand();
	}
}
