package robotClass;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=1234;
		int rev=0;
		for(;number!=0;) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
			
		}
		System.out.println(rev);
	}


}
