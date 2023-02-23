package test01;

public class WorkOut_Example {

	public static void main(String[] args) {
		WorkOut workout = new WorkOut();
		Me me = new Me();
		
		Football football = new Football();
		Baseball baseball = new Baseball();
		
		me.do_workout(football);
		me.do_workout(baseball);
	}
}
