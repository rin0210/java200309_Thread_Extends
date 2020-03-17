package Test;

public class Me extends Father { // Father에 있는 자원을 상속받겠다.
	int myMoney = 20000;

//	Me() {
//		super(); // 상속받은 클래스의 생성자
//	}
	
	// 자식이 달라는 대로 부모의 자원을 받아 올 수 있음
//	public void getMoney() {
//		int newM = super.getMoney(500);	// super : Father 클래스를 가리킴, 상속받음
//		myMoney = myMoney + newM;
//	}
	
	// Override Vs Overloading(같은 이름의 메서드, 다른 매개변수 -> 메서드 명을 같게 사용 해도 OK)
	@Override	// 아빠가 제공한 getMoney를 호출해서 super클래스에 정의된 기능 그대로 사용하지 않고 독자적으로 재정의함
	public void getMoney() {
		// TODO Auto-generated method stub
		super.getMoney();
	}
	

	public void myMoney() {
		System.out.println(" 내 돈은 : " + this.myMoney);
		super.prt();
	}


}
