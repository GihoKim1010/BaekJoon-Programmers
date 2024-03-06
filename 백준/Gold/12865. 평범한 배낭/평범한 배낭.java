import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		int[][] dp = new int[n + 1][k + 1];

		for (int i = 1; i <= n; i++) {
			int w = sc.nextInt(), v = sc.nextInt();
			
			for(int j=1; j<=k; j++) {
				dp[i][j]=dp[i-1][j];
			}
			
			if (w <= k) {
				// 무게가 동일한경우 (안넣거나, 교체했을때 무게가 같은경우)
				dp[i][w] = Math.max(dp[i][w], v);

				// 물건을 넣는경우
				for (int j = 1; j + w <= k; j++) {
					if (dp[i - 1][j] != 0) {
						dp[i][j + w] = Math.max(dp[i - 1][j + w], dp[i - 1][j] + v);
					}
				}
			}
		}
		
		int max = 0;
		for (int i = 1; i <= k; i++) {
			max = Math.max(max, dp[n][i]);
		}
		System.out.println(max);
	}
}