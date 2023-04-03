package workout;

public class MethodOverloading {
	
	static int max(int a,int b) {
		return a>b?a:b;
	}
	
	static double max(double a,double b) {
		return a>b?a:b;
	}
	
	static float max(float a,float b) {
		return a>b?a:b;
	}
	
	public static void main(String[]args) {
		System.out.println(max(5,7));
		System.out.println(max(4.6,5.4));
	}

}
