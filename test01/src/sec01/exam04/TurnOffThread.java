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
			System.out.println(getName()+"�� �α׾ƿ� �Ͽ����ϴ�");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}