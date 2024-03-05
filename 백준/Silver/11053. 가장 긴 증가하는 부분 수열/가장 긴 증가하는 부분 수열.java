import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] dp = new int[n];

		int max = 0;
		int maxDp = 0;
		for (int i = 0; i < n; i++) {
			maxDp = 0;
			for (int j = i; j >= 0; j--) {
				if (a[j] < a[i]) {
					maxDp = Math.max(maxDp, dp[j]);
				}
				dp[i] = maxDp + 1;
			}
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}