import java.util.Scanner;

public class Main {

	private static int M, N;
	private static int[][] hive;
	private static int[][] grows;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		hive = new int[M][M]; // 초기값이 다 0이므로 출력시 +1;
		grows = new int[M][M];

		for (int i = 0; i < N; i++) {

			int zero = sc.nextInt(), one = sc.nextInt(), two = sc.nextInt();
			int x = 0, y = M - 1;
			for (int k = 0; k < zero; k++) {
				grows[y][x] = 0;
				if (y == 0) {
					x++;
				} else {
					y--;
				}
			}

			for (int k = 0; k < one; k++) {
				grows[y][x] = 1;
				hive[y][x]+=1;
				
				if (y == 0) {
					x++;
				} else {
					y--;
				}
			}

			for (int k = 0; k < two; k++) {
				grows[y][x]= 2;
				hive[y][x]+=2;

				if (y == 0) {
					x++;
				} else {
					y--;
				}
			}
			growInThisDay();
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				result.append(hive[i][j]+1+ " ");
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

	private static void growInThisDay() {
		for (int i = 1; i < M; i++) {
			for (int j = 1; j < M; j++) {
				int max = Math.max(grows[i - 1][j - 1], grows[i - 1][j]);
				grows[i][j] = Math.max(max, grows[i][j - 1]);
				hive[i][j] += grows[i][j];
			}
		}
	}
}