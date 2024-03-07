import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] box = new int[n];
		int[] dp = new int[n];
		
		for(int i =0; i<n; i++) {
			box[i]=sc.nextInt();
		}
		
		dp[0]=1;
		
		for(int i=1; i<n; i++) {
			for(int j=i; j>=0; j--) {
				if(box[j]<box[i]) {
					dp[i]=Math.max(dp[i], dp[j]);
				}
			}
			dp[i]++;
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}