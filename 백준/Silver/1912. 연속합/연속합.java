import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		int[] dp = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i]=sc.nextInt();
		}
		dp[0]=num[0];
		
		for(int i=1; i<n; i++) {
			dp[i]=num[i]+Math.max(dp[i-1], 0);
		}
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}