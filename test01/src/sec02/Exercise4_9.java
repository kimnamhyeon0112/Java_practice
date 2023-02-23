package sec02;

public class Exercise4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		int value = 0;
		for (int i = 0; i < str.length(); i++) {
			value = str.charAt(i)-48;
			sum+=value;
		}
		System.out.println("sum="+sum);
	}
}
