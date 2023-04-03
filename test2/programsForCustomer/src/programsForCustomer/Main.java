package programsForCustomer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Methods methodFunction =new Methods();
		
			System.out.println("press 1 for prime number");
			System.out.println("press 2 for palindrome");
			System.out.println("press 3 for add a number");
			System.out.println("press 4 for sub a number");
			System.out.println("press 5 for exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the choice");
			int choice1=sc.nextInt();
			switch(choice1) {
			case 1:
				System.out.println("enter the prime number");
				int input=sc.nextInt();
			if(methodFunction.checkPrime(input)) {
				System.out.println("it is the prime number");
			}
			else {
				System.out.println("it is not prime");
			}
			break;
			case 2:
				System.out.println("enter the string");
				String input4=sc.nextLine();
				if(methodFunction.checkPalindrome(input4)) {
					System.out.println("it is palindrome");
				}
				else {
					System.out.println("it is not palindrome");
				}
				break;
			case 3:
				System.out.println("enter the first number");
				int a1=sc.nextInt();
				System.out.println("enter the Second number");
				int z1=sc.nextInt();
				
				int output = methodFunction.add(a1, z1);
				System.out.println(output);
				break;
				
			case 4:
				System.out.println("enter the first number");
				int a2=sc.nextInt();
				System.out.println("enter the Second number");
				int z2=sc.nextInt();
				int output1 = methodFunction.sub(a2, z2);
				System.out.println(output1);
				break;
				
			case 5:
				break;
				
			default:
				System.out.println("wrongchoice");
				
				
			}
			
		}

	}


