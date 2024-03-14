package spring.strategyPattern;

public class StrategySword implements Strategy {
	@Override
	public void runStrategy() {
		System.out.println("다신 꺼내지 않기로했는데... 미안해 할아범...");
		System.out.println("울어라, 지옥참마도!!");
	}
}
