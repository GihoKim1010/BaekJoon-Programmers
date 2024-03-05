import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[][] sticker = new int[2][n];
			int[][] dp = new int[2][n];

			for (int j = 0; j < n; j++) {
				sticker[0][j] = sc.nextInt();
			}
			for (int j = 0; j < n; j++) {
				sticker[1][j] = sc.nextInt();
			}

			dp[0][0] = sticker[0][0];
			dp[1][0] = sticker[1][0];

			if (n >= 2) {
				dp[0][1] = sticker[0][1] + sticker[1][0];
				dp[1][1] = sticker[1][1] + sticker[0][0];
			}

			for (int j = 2; j < n; j++) {
				dp[0][j] = sticker[0][j] + Math.max(dp[1][j - 1], dp[1][j - 2]);
				dp[1][j] = sticker[1][j] + Math.max(dp[0][j - 1], dp[0][j - 2]);
			}
			result.append(Math.max(dp[0][n - 1], dp[1][n - 1])).append("\n");
		}
		System.out.println(result.toString());
	}
}