package sec02;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();

		
		System.out.println("이름: "+stu.name);
		System.out.println("합계점수: " +stu.getTotal());
		System.out.println("평균: "+ stu.getAverage());
	}

}
