import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		long[] a = new long[n];
		long[] sum = new long[n + 1]; // 부분합 구할 용도

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			sum[i + 1] = sum[i] + a[i];
		}
		int left = 0, right = 1, count = 0;
		long partialSum = sum[right] - sum[left];
		while (right != n || partialSum >= m) {
			if (partialSum == m) {
				count++;
				left++;
			} else if (partialSum < m) {
				right++;
			} else {
				left++;
			}
			partialSum = sum[right] - sum[left];
		}

		System.out.println(count);
	}
}