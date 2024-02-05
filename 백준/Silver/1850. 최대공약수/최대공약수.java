import java.util.Scanner;

public class Main {
	
	public static long findGCD(long a, long b) {
	      while(b !=0) {
	            long temp=b;
	            b=a%b;
	             a =temp;
	       }
	       return a;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		StringBuilder result = new StringBuilder();
		for(int i =0; i<findGCD(a,b); i++) {
			result.append("1");
		}
		System.out.println(result.toString());
	}
}
