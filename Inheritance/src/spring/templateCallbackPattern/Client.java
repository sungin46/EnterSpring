package spring.templateCallbackPattern;

public class Client {

	public static void main(String[] args) {
		Strategy strategy = null;
		Soldier rambo = new Soldier();
		
		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("두두두두");
			}
		});
		
		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("울어라, 지옥참마도!!");
			}
		});
		
		System.out.println();

		rambo.runContext(new Strategy() {
			@Override
			public void runStrategy() {
				System.out.println("엑스 엑스 엑스 찍어");
			}
		});
		
	}

}
