import java.util.Scanner;

public class Main {
	
	public static int remain (int N, int K) {
		if(K==1) {
			int temp=1;
			while(temp<N) {
				temp*=2;
			}
			return temp-N;
		}else {
			int temp=1;
			while(temp<N) {
				temp*=2;
			}
			return remain(N-temp/2, K-1);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int result = remain(N,K);
		System.out.println(result);
	}
}