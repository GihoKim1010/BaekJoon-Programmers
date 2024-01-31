import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] score = new int[N];

		for (int i = 0; i < N; i++) {
			score[i] = sc.nextInt();
		}

		int count = 0;
		if (N == 1) {
			System.out.println(0);
		} else {
			for (int i = N - 1; i > 0; i--) {
				if (score[i] <= score[i - 1]) {
					count += score[i - 1] - (score[i] - 1);
					score[i - 1] = score[i] - 1;
				}
			}
			System.out.println(count);
		}
	}
}