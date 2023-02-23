package sec02;

public class Student {

	String name = "ȫ�浿";
	int ban = 1;
	int no = 1;
	int kor = 100;
	int eng = 60;
	int math = 76;
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int) (getTotal() / 3f*10 + .5f)/10f;
	}
	
	Student() {
		
	}
	
	Student(String name){
		this.name = name;
	}
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.printf(name, ban, no, kor, eng, math);
//		System.out.print(","+getTotal());
//		System.out.print(","+getAverage());
	}
}
