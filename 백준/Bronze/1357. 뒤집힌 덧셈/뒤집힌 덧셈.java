import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(), Y=sc.nextInt();
		System.out.println(rev(rev(X)+rev(Y)));
	}
	
	public static int rev(int N) {
		int result = 0;
		
		while(N!=0) {
			result*=10;
			result+=(N%10);
			N/=10;
		}
		
		return result;
	}
}