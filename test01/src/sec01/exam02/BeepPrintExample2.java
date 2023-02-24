package sec01.exam02;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
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
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Main thread");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
