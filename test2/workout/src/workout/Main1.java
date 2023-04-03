package workout;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product Id ");
		Long i=Long.parseLong(sc.nextLine());
		System.out.println("Enter the product name ");
		String pn=sc.nextLine();
		System.out.println("Enter the product name ");
		String sn=sc.nextLine();
		ProductCon productCon=new ProductCon(i,pn,sn);
		
		
		productCon.display();

	}

}
