package speed_limit;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(0);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());
		
//		if(!myCar.isStop()) {
//			myCar.setStop(true);
//		}
		myCar.zone(null);
	}
}
