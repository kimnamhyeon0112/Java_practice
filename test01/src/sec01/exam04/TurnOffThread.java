package sec01.exam04;

import java.awt.Toolkit;

public class TurnOffThread extends Thread{
	public TurnOffThread() {
		setName("User1");
	}
	
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			System.out.println(getName()+"가 로그아웃 하였습니다");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
