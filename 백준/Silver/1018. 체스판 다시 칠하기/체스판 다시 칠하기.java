import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		int min_Count=64;

		int[][] board = new int[N][M];
		int[][] calc = new int[N][M]; // 옆칸과 다른지를 알기위함.

		for (int i = 0; i < N; i++) {
			String temp = sc.nextLine();
			for (int j = 0; j < temp.length(); j++) {
				char x = temp.charAt(j);
				board[i][j] = x;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if ((i+j)%2==0 && board[i][j] != board[0][0]) {
					calc[i][j] = 1;
				} else if ((i+j)%2==1 && board[i][j] == board[0][0]) {
					calc[i][j] = 1;
				}
			}
		}
		
		int x = 0;
		int y = 0;

		while (x+7<N && y+7<M) {
			int count = 0;
			

			for (int i = x; i <= x + 7; i++) {
				for (int j = y; j <= y + 7; j++) {
					count += calc[i][j];
				}
			}
			
			if (count >= 32) {
				count = 64 - count;
			}
			
			min_Count=Math.min(min_Count, count);
			
			if(x+7==N-1) {
				x=0;
				y++;
			}else {
				x++;
			}
		}
		System.out.println(min_Count);
	}
}