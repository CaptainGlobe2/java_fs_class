package workout;

public class ReturnTypeVsVoid {
	int square(int number) {
		return number*number;
	}
	void cube(int number) {
		int cube=number*number*number;
		System.out.println("the cube is"+cube);
	}
	
}
