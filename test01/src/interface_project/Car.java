package interface_project;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void drive() {
		System.out.print("����");
		frontLeftTire.roll();
		
		System.out.print("����");
		frontRightTire.roll();
		
		System.out.print("����");
		backLeftTire.roll();
		
		System.out.print("����");
		backRightTire.roll();
	}
}
