package project1;

public class palindrome {

	public static void main(String[] args) {
		String word ="abcd";
		String word1 ="";
		for(int i=word.length()-1;i>=0;i--) {
			word1=word1+word.charAt(i);
		}
		System.out.println(word1);
		if(word.equals(word1))
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");

	}

}
