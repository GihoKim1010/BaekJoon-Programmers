import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long[] dp = new long[n + 1];
			dp[0] = 0;
			dp[1] = 1;

			if (n >= 2) {
				dp[2] = 2;
			}

			if (n >= 3) {
				dp[3] = 4;
			}

			for (int j = 4; j <= n; j++) {
				dp[j] = (dp[j - 1] + dp[j - 2] + dp[j - 3]) % 1000000009;
			}
			
			result.append(dp[n]%1000000009).append("\n");
		}
		
		System.out.println(result.toString());
	}
}