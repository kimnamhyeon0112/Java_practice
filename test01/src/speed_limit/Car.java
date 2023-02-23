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
			System.out.println("과속");
			if(speed - zone_speed <= 10)
				System.out.println("10km/h과속 벌점 10점");
			else if(speed - zone_speed <= 20)
				System.out.println("20km/h과속 벌점 20점 + 면허정지 5일");
			else if(speed - zone_speed <= 30)	
				System.out.println("30km/h과속 벌점 30점 + 면허취소 1년");
			else	
				System.out.println("면허 영구 취소");
			}
		else
			System.out.println("정상 속도");
	}
}
