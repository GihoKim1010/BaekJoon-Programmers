import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[][] sum = new int[N+1][K+1];
		
		for(int i =1; i<=N; i++) {
			for(int j=1; j<=K; j++) {
				if(i==1) {
					sum[i][j]=j;
				}else if(j==1) {
					sum[i][j]=1;
				}else {
					sum[i][j]=(sum[i-1][j]+sum[i][j-1])%1000000000;
				}
			}
		}

		System.out.println(sum[N][K]%1000000000);
		
	}
}