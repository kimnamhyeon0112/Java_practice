package speed_limit;
import java.util.random;

public class Car {
	private int speed;
	private boolean stop;
	private String zone;
	private int zone_speed;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = (int)(Math.random()*150+1);
		return;
	}
	
//	public boolean isStop() {
//		return stop;
//	}
//	public void setStop(boolean stop) {
//		this.stop = stop;
//		this.speed = 0;
//	}
	
	public void zone(String zone) {
		this.zone = "A";
		this.zone_speed = 100;
		if(zone_speed < speed) {
			System.out.println("����");
			if(speed - zone_speed <= 10)
				System.out.println("10km/h���� ���� 10��");
			else if(speed - zone_speed <= 20)
				System.out.println("20km/h���� ���� 20�� + �������� 5��");
			else if(speed - zone_speed <= 30)	
				System.out.println("30km/h���� ���� 30�� + ������� 1��");
			else	
				System.out.println("���� ���� ���");
			}
		else
			System.out.println("���� �ӵ�");
	}
}
