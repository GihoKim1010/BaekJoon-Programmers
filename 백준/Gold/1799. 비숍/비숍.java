import java.util.Scanner;

public class Main {

	static int n;
	static int[][] board;
	static int maxW, maxB;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		board = new int[n][n];
		maxW = 0;
		maxB=0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}

		white(0, 0, 0);
		black(0, 1, 0);
		System.out.println(maxW+maxB);
	}

	static void white(int y, int x, int count) {

		if (x >= n) {
			y++;
			x = (y%2==0) ? 0 : 1 ;
		}

		if (y == n) {
			maxW = Math.max(maxW, count);
			return;
		}

		if (able(y, x) && board[y][x]==1) {
			board[y][x] = 2;
			white(y, x + 2, count + 1);
			board[y][x] = 1;
		}

		white(y, x + 2, count);
	}
	
	static void black(int y, int x, int count) {

		if (x >= n) {
			y++;
			x = (y%2==0) ? 1 : 0;
		}

		if (y == n) {
			maxB = Math.max(maxB, count);
			return;
		}

		if (able(y, x) && board[y][x]==1) {
			board[y][x] = 2;
			black(y, x + 2, count + 1);
			board[y][x] = 1;
		}

		black(y, x + 2, count);
	}

	static boolean able(int y, int x) {
		for (int i = 0; i <= y; i++) {
			int newY = y - i, leftX = x - i, rightX = x + i;
			if (leftX >= 0 && board[newY][leftX] == 2) {
				return false;
			} else if (rightX < n && board[newY][rightX] == 2) {
				return false;
			}
		}
		return true;
	}
}