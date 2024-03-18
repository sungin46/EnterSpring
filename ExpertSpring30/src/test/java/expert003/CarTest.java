package expert003;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("expert003.xml")

@SpringBootTest
class CarTest {
	@Autowired
	Car car;
	
	@Test
	public void 자동차_코리아타이어_장착_테스트() {
		assertEquals("장착한 타이어 : 코리아 타이어", car.getTireBrand());
	}
}
