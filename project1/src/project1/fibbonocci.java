package project1;
import java.util.*;
public class fibbonocci {
	public static void main(String[] args) {
		int x=0;
		int y=1;
		int temp;
		
	    Scanner sw= new Scanner(System.in); //System.in is a standard input stream.
	    System.out.print("Enter a number: ");
	    int in= sw.nextInt(); //reads number.
	    System.out.println("0");
		System.out.println("1");
		

		for(temp=0;temp<=in;temp++) {
			temp=x+y;
			x=y;
			y=temp;
			System.out.println(temp);
		}
		
	}
}
