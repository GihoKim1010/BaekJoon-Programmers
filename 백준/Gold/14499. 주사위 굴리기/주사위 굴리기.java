import java.util.Scanner;

public class Main {

	private static int[][] map;
	private static int[] dice;
	private static int N, M, x, y;
	private static StringBuilder result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		int K = sc.nextInt();
		map = new int[N][M];
		dice = new int[6];
		result = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		
		for (int i = 0; i < K; i++) {
			int order = sc.nextInt();
			rollDice(order);
		}
		System.out.println(result.toString());
	}
	

	private static void rollDice(int order) {

		boolean isMoved = false;

		switch (order) {
		case 1:
			if (y + 1 <= M - 1) {
				int temp = dice[0];
				dice[0] = dice[3];
				dice[3] = dice[5];
				dice[5] = dice[2];
				dice[2] = temp;
				y++;
				isMoved = true;
			}
			break;
		case 2:
			if (y - 1 >= 0) {
				int temp = dice[0];
				dice[0] = dice[2];
				dice[2] = dice[5];
				dice[5] = dice[3];
				dice[3] = temp;

				y--;
				isMoved = true;
			}
			break;
		case 3:
			if (x - 1 >= 0) {
				int temp = dice[0];
				dice[0] = dice[4];
				dice[4] = dice[5];
				dice[5] = dice[1];
				dice[1] = temp;

				x--;
				isMoved = true;
			}
			break;
		case 4:
			if (x + 1 <= N - 1) {
				int temp = dice[0];
				dice[0] = dice[1];
				dice[1] = dice[5];
				dice[5] = dice[4];
				dice[4] = temp;

				x++;
				isMoved = true;
			}
			break;
		}

		if (isMoved) {
			if (map[x][y] == 0) {
				map[x][y] = dice[5];
			} else {
				dice[5] = map[x][y];
				map[x][y] = 0;
			}
			result.append(dice[0]).append("\n");
		}
	}
}