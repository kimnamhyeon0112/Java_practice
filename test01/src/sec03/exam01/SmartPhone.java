package sec03.exam01;
import java.util.Scanner;

public class SmartPhone extends Phone {
	//������
	public SmartPhone(String owner) {
		super(owner);
	}
	//�޼ҵ�
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
	
	@Override
	public void AppMarket() {
		System.out.println("�۽���� �Դϴ�. �ٿ���� ���� �˻��Ͻʽÿ�");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str + "�� �ٿ�����ðڽ��ϱ�?");
		int answer = scanner.nextInt();
		if(answer == 1)
			System.out.println("�ٿ�ε带 �����մϴ�");
		else if (answer == 0)
			System.out.println("�۽���� ����");
		
	}
}
