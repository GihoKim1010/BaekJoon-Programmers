import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		long[][] dp = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		dp[0][0] = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (dp[i][j] != 0 && board[i][j]!=0) {
					int x = board[i][j];
					if (i + x < n) {
						dp[i + x][j] += dp[i][j];
					}
					if (j + x < n) {
						dp[i][j + x] += dp[i][j];
					}
				}
			}
		}
		
		System.out.println(dp[n-1][n-1]);
	}
}