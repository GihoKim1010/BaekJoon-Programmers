import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N+1];
		ar[0]=0;
		ar[1]=1;
		
		for(int i=2; i<=N; i++) {
			ar[i]=ar[i-1]+ar[i-2];
		}
		System.out.println(ar[N]);
	}
}