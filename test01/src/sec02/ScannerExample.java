package sec02;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Է��� ���ڿ�: \""+inputData+"\"");
			if(inputData.equals("q")) {
				break;
			}
		}
		System.out.println("����");
	}
}
