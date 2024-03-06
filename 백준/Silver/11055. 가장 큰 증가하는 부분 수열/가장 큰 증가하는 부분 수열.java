import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		dp = a.clone();
		int max=0;

		for (int i = 1; i < n; i++) {
			max = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] > a[j]) {
					max=Math.max(dp[j],max);
				}
			}
			dp[i]+=max;
		}
		Arrays.sort(dp);
		System.out.println(dp[n - 1]);
	}
}