package sec02;

import java.util.Scanner;

public class sample_run {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int won500, won100, won50, won10, money;
		Scanner scanner = new Scanner(System.in);
		System.out.println("money= ");
		money = scanner.nextInt();
		won500 = money / 500;
		won100 = (money - (won500 * 500)) / 100;
		won50 = (money - (won500 * 500)) / 100;
		won10 = money - (won500 * 500 + won100 * 100 + won50 * 50);
		
		System.out.println("500원:"+won500);
		System.out.println("100원:"+won100);
		System.out.println("50원:"+won50);
		System.out.println("10원:"+won10);
		}
}

