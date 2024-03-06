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
		
		dp[0]=1;
		int length =0;
		for (int i = 1; i < n; i++) {
			length=0;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] < a[j]) {
					length=Math.max(length, dp[j]);
				}
			}
			dp[i]=length+1;
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n - 1]);
	}
}