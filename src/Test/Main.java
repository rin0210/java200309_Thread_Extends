package Test;

public class Main {

	public static void main(String[] args) {
		Me m = new Me();
		m.myMoney(); // ���� ���� �뵷�� ����
		m.getMoney(); // �ƹ����κ��� ���� �ݾ�
		m.myMoney(); // ���� ���� �뵷�� ����

		Me m1 = new Me(); // ��ü�� ��������� ����� �޾Ҵٸ� ���� Ŭ������ ���� �����ȴ�.
		m1.myMoney(); // Father��� ����Ŭ������ ���� �������� ��
	}

}
