package aop002;

import org.aopalliance.intercept.Joinpoint;
import org.junit.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.aspectj.lang.annotation.*;

@EnableAspectJAutoProxy
//@Aspect
public class MyAspect{
	@Before
	public void before(Joinpoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라.");
	}
}