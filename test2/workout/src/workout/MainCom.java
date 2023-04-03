package workout;

public class MainCom {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
		System.out.println(args[i]);
		
		if(args[0]==null) {
			System.out.println("the number of arguments passed is 0");
		}
	}

}
