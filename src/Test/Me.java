package Test;

public class Me extends Father { // Father�� �ִ� �ڿ��� ��ӹްڴ�.
	int myMoney = 20000;

//	Me() {
//		super(); // ��ӹ��� Ŭ������ ������
//	}
	
	// �ڽ��� �޶�� ��� �θ��� �ڿ��� �޾� �� �� ����
//	public void getMoney() {
//		int newM = super.getMoney(500);	// super : Father Ŭ������ ����Ŵ, ��ӹ���
//		myMoney = myMoney + newM;
//	}
	
	// Override Vs Overloading(���� �̸��� �޼���, �ٸ� �Ű����� -> �޼��� ���� ���� ��� �ص� OK)
	@Override	// �ƺ��� ������ getMoney�� ȣ���ؼ� superŬ������ ���ǵ� ��� �״�� ������� �ʰ� ���������� ��������
	public void getMoney() {
		// TODO Auto-generated method stub
		super.getMoney();
	}
	

	public void myMoney() {
		System.out.println(" �� ���� : " + this.myMoney);
		super.prt();
	}


}
