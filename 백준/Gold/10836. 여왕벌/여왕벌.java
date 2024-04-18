import java.util.Scanner;

public class Main {

	private static int M, N;
	private static int[] leftColumn;
	private static int[] topRow;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		leftColumn = new int[M];
		topRow = new int[M];

		for (int i = 0; i < N; i++) {

			int zero = sc.nextInt(), one = sc.nextInt(), two = sc.nextInt();
			for (int j = M - 1; j >= 0; j--) {
				if (zero != 0) {
					leftColumn[j] += 0;
					zero--;
				} else if (one != 0) {
					leftColumn[j] += 1;
					one--;
				} else {
					leftColumn[j] += 2;
				}
			}

			for (int j = 1; j < M; j++) {
				if (zero != 0) {
					topRow[j] += 0;
					zero--;
				} else if (one != 0) {
					topRow[j] += 1;
					one--;
				} else {
					topRow[j] += 2;
				}
			}
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			result.append(leftColumn[i] + 1 + " ");

			for (int j = 1; j < M; j++) {
				result.append(topRow[j] + 1 + " ");
			}
			result.append("\n");
		}
		
		System.out.println(result.toString());
	}
}