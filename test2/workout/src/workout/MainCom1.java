package workout;

public class MainCom1 {
	public static void main(String[] args) {
		/*for(String str:args) {
			int argument = Integer.parseInt(str);*/
		int a =Integer.parseInt(args[0]);
		int b =Integer.parseInt(args[1]);
		int sum=a+b;
			
		
		if(args.length==0||args.length==3) {
			System.out.println("invalid input");
			}
		else {
			System.out.println("the sum of "+args[0]+" and "+args[1]+" is "+sum);
		}
		
		
	}

}
