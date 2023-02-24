package sec01.exam04;

import java.awt.Toolkit;

public class TalkThread extends BeepThread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
