import java.util.Scanner;

public class Main {
	
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder result = new StringBuilder();
		for(int i=0; i<t; i++) {
			int a=sc.nextInt(), b=sc.nextInt();
			int gcd = findGCD(a,b);
			int lcm = a*b/gcd;
			result.append(lcm+" "+gcd+"\n");
		}
		
		System.out.println(result.toString());
	}
}