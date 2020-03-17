package Test;

public class Father {
	int money = 50000;

	// 자식이 달라는 대로 자원을 주는 것
//	public int getMoney(int m) {	
//		money = money - m;
//		return m;
//	}
	
	// getMoney라는 메서드를 자식들이 자체적으로 재정의해라.
	public void getMoney() {
		
	}

	public void prt() {
		System.out.println("Father money : " + money);
	}
}
