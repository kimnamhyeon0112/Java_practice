package sec01.exam04;

import java.awt.Toolkit;

public class BeepPrintExample4 {
	public static void main(String[] args) {
		Runnable beepThread = new BeepThread();
		Runnable turnonThread = new TurnOnThread();
		Runnable turnoffThread = new TurnOffThread();
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<1000; i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
					}
				}
			});

		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("��");
			System.out.println("������ �մϴ�");
			System.out.println("������ �����մϴ�");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}