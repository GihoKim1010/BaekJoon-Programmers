import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weight = new int[n];

		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}

		Arrays.sort(weight);

		long sum = 0;
		long answer = 0;

		if (weight[0] == 1) {
			for (int i = 0; i < n - 1; i++) {
				sum += weight[i];
				if (sum + 1 < weight[i + 1]) {
					answer = sum + 1;
					break;
				}
			}

			if (answer == 0) {
				answer = sum + weight[n - 1] + 1;
			}
		}else {
			answer=1;
		}

		System.out.println(answer);
	}
}