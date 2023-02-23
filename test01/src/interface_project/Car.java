package interface_project;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new KumhoTire();
	Tire backRightTire = new KumhoTire();
	
	void drive() {
		System.out.print("謝難");
		frontLeftTire.roll();
		
		System.out.print("辦難");
		frontRightTire.roll();
		
		System.out.print("謝難");
		backLeftTire.roll();
		
		System.out.print("辦難");
		backRightTire.roll();
	}
}
