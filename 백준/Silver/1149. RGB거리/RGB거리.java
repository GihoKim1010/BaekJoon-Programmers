import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] houses = new int[n][3];
		int[][] dp = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				houses[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<3; i++) {
			dp[0][i]=houses[0][i];
		}
		
		for(int i=1; i<n; i++) {
			dp[i][0]=houses[i][0]+Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1]=houses[i][1]+Math.min(dp[i-1][2], dp[i-1][0]);
			dp[i][2]=houses[i][2]+Math.min(dp[i-1][0], dp[i-1][1]);
		}
		int min = dp[n-1][0];
		min=Math.min(dp[n-1][1], min);
		min=Math.min(dp[n-1][2], min);
		
		System.out.println(min);
	}
}