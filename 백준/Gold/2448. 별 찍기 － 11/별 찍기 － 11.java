import java.util.Scanner;

public class Main {

	static String[][] board;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		board = new String[n][2 * n - 1];
		StringBuilder result = new StringBuilder();

		drawStar(0, n - 1, n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (board[i][j]==null) {
					result.append(" ");
				} else {
					result.append(board[i][j]);
				}
			}
			result.append("\n");
		}

		System.out.println(result.toString());
	}

	static void drawStar(int y, int x, int size) {
		if (size == 3) {
			board[y][x] = "*";
			board[y + 1][x - 1] = board[y + 1][x + 1] = "*";
			for (int i = -2; i <= 2; i++) {
				board[y + 2][x + i] = "*";
			}
			return;
		}
		
		drawStar(y,x,size/2);
		drawStar(y+size/2, x-size/2, size/2);
		drawStar(y+size/2, x+size/2, size/2);
	}
}