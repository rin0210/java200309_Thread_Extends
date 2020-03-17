package Test;

public class Main {

	public static void main(String[] args) {
		Me m = new Me();
		m.myMoney(); // 현재 나의 용돈의 총합
		m.getMoney(); // 아버지로부터 받을 금액
		m.myMoney(); // 현재 나의 용돈의 총합

		Me m1 = new Me(); // 객체가 만들어질때 상속을 받았다면 상위 클래스도 새로 생성된다.
		m1.myMoney(); // Father라는 상위클래스는 각각 독립적인 것
	}

}
