import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean[][] board = new boolean[101][101];

		for (int i = 0; i < 4; i++) {
			int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();

			for (int j = x1; j < x2; j++) {
				for (int k = y1; k < y2; k++) {
					board[j][k] = true;
				}
			}
		}
		int count = 0;
		for (int j = 0; j <= 100; j++) {
			for (int k = 0; k <= 100; k++) {
				if (board[j][k]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}