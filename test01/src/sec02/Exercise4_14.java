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
			System.out.println("1과 100사이의 값을 입력하세요: ");
			input = s.nextInt();
			
			if(answer > input)
				System.out.println("더 큰 수를 입력하세요");
			else if(answer < input)
				System.out.println("더 작은 수를 입력하세요");
			else {
				System.out.println("맞췄습니다");
				System.out.println(count+"번 만에 맞췄습니다");
				break;
			}
		} while(true);
	}
}
