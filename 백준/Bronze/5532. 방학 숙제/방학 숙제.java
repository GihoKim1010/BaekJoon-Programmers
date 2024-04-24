import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt(), A=sc.nextInt(), B=sc.nextInt(), C=sc.nextInt(), D=sc.nextInt();
		int x = (A%C == 0 ) ? A/C : A/C+1;
		int y = (B%D == 0 ) ? B/D : B/D+1;
		int max = Math.max(x, y);
		System.out.println(L-max);
	}
}