package sec03.exam01;
import java.util.Scanner;

public class SmartPhone extends Phone {
	//생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	//메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	
	@Override
	public void AppMarket() {
		System.out.println("앱스토어 입니다. 다운받을 앱을 검색하십시오");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str + "을 다운받으시겠습니까?");
		int answer = scanner.nextInt();
		if(answer == 1)
			System.out.println("다운로드를 시작합니다");
		else if (answer == 0)
			System.out.println("앱스토어 종료");
		
	}
}
