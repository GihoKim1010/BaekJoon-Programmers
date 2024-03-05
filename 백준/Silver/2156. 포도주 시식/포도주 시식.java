import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] wine = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			wine[i] = sc.nextInt();
		}
		
		dp[1] = wine[1];

		if (n >= 2) {
			dp[2] = wine[2] + wine[1];
		}
		
		for (int i = 3; i <= n; i++) {
			dp[i]=Math.max(dp[i-1], Math.max(dp[i-2]+wine[i], dp[i-3]+wine[i-1]+wine[i]));
		}
		
		Arrays.sort(dp);
		
		System.out.println(dp[n]);
	}
}