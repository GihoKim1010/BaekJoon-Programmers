import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n][12];
		
		//0 번칸과 11번칸을 공란으로 만듦. 0~9를 1~10에 저장.
		for(int i=2; i<=10; i++) {
			dp[0][i]=1;
		}
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<=10; j++) {
				dp[i][j]=((dp[i-1][j-1]%1000000000)+(dp[i-1][j+1]%1000000000)%1000000000);
			}
		}
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum =(sum+dp[n-1][i]%1000000000)%1000000000;
		}
		System.out.println(sum);
	}
}