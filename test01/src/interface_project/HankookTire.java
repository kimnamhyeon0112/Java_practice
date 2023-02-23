package interface_project;

public class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("앞쪽 타이어 회전");
	}
}
