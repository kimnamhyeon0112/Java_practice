package sec04;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum(int x, int y) {
			int result = x + y;
			return result;
		}
		
		int sum(int x, int y, int z) {
			int result = x+y+z;
			return result;
		}
		
		int sum(int x, int y, int z, int w) {
			int result = x+y+z+w;
			return result;
		}
		sum(50,5);
	}
}