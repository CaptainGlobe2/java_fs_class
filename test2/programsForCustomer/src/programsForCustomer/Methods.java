package programsForCustomer;

public class Methods {
	
	 public boolean checkPrime(int n){
		 int i,divisor=0;
		 for(i=1;i<=n;i++) {
			 if(n%i==0) {
				 
			 
			 divisor++;
			 }
		 }
		 if(divisor==2) {
			 return true;
			 
		 }
		
		 else {
			 return false;
		 }
		 
		
		 
		    
		}  
	
	 public int add(int a,int b) {
		 return a+b;
	 }
	 
	 public int sub(int a,int b) {
		 return a-b;
	 }
	 
	 public boolean checkPalindrome(String s) {
		 int i;
		 String s2="";
		 for (i=s.length()-1;i>=0;i++) {
			 s2=s2+s.charAt(i);
		 }
		 
		 if(s.equals(s2)) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
}
