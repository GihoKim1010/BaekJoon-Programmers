import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// 입력받아 누적합 계산
		long[] sum = new long[n + 1];
		for (int i = 1; i <= n; i++) {
			sum[i] = sum[i - 1] + sc.nextLong();
		}
		long result = 0;
		for (int i = 1; i < n; i++) {
			long calc = (long)((sum[i]-sum[i-1]) * (sum[n] - sum[i]));
			result += calc;
		}
		System.out.println(result);
	}
}