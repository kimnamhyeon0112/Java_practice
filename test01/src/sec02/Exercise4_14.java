package sec02;
import java.util.Scanner;
import java.util.random;

public class Exercise4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer;
		answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ���: ");
			input = s.nextInt();
			
			if(answer > input)
				System.out.println("�� ū ���� �Է��ϼ���");
			else if(answer < input)
				System.out.println("�� ���� ���� �Է��ϼ���");
			else {
				System.out.println("������ϴ�");
				System.out.println(count+"�� ���� ������ϴ�");
				break;
			}
		} while(true);
	}
}
