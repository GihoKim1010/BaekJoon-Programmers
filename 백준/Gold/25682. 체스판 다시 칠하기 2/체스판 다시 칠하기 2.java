import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		int[][] board = new int[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				if ((i + j) % 2 == 0) {
					if (input.charAt(j) == 'B') {
						board[i + 1][j + 1] = board[i + 1][j];
					} else {
						board[i + 1][j + 1] = board[i + 1][j] + 1;
					}
				} else {
					if (input.charAt(j) == 'B') {
						board[i + 1][j + 1] = board[i + 1][j] + 1;
					} else {
						board[i + 1][j + 1] = board[i + 1][j];
					}
				}
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				board[i][j]+=board[i-1][j];
			}
		}
		
		int answer = k*k;
		for(int i =0; i<n+1-k; i++) {
			for(int j=0; j<m+1-k; j++) {
				int count = board[i][j]+board[i+k][j+k]-board[i][j+k]-board[i+k][j];
				count = Math.min(count, k*k-count);
				answer = Math.min(count, answer);
			}
		}
		System.out.println(answer);
	}
}