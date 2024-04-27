import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int K =sc.nextInt(), N=sc.nextInt(), M=sc.nextInt();
		int more = K*N-M;
		
		if(more<=0) {
			System.out.println(0);
		}else {
			System.out.println(more);
		}
	}
}