package project1;

public class primenumber {
	public static void main(String[] args) {
		int n=7,divisor=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				divisor++;
			}
		}
		if(divisor==2) {
			System.out.println("prime");
		}
		else {
		System.out.println("Not a prime");
		}
	}

}
