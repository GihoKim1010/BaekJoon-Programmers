import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[][] box;
	public static Queue<int[]> qu;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();
		box = new int[n][m];
		qu = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				box[i][j] = sc.nextInt();
				if (box[i][j] == 1) {
					qu.add(new int[] { i, j });
				}
			}
		}
		
		bfs(n,m);
		
		int maxDate =0;
		loop_a:
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(box[i][j]==0) {
					maxDate=0;
					break loop_a;
				}else {
					maxDate=Math.max(maxDate, box[i][j]);
				}
			}
		}
		System.out.println(maxDate-1);
	}

	public static void bfs(int n, int m) {
		int date = 0;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!qu.isEmpty()) {
			int[] location = qu.poll();
			int y = location[0];
			int x = location[1];
			date = box[y][x];

			for (int[] dir : directions) {
				int newY = y + dir[0];
				int newX = x + dir[1];

				if (newY >= 0 && newY < n && newX >= 0 && newX < m && box[newY][newX] == 0) {
					box[newY][newX] = date + 1;
					qu.add(new int[] { newY, newX });
				}
			}
		}
	}
}