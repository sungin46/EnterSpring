package aop001;

public class Boy {
	public void runSomething() {
		System.out.println("열쇠로 문을 열고 집에 들어감.");
		try {
			System.out.println("컴퓨터 게임을 한다."); //핵심 관심사
		}catch(Exception e) {
			if(e.getMessage().equals("집에 불남")) {
				System.out.println("119에 신고해");
			}
		}finally {
			System.out.println("불끄고 잔다.");
		}
		
		System.out.println("문 잠그고 집을 나선다.");
	}
}
