import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[][][] box;
	public static Queue<int[]> qu;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt(), k = sc.nextInt();
		box = new int[k][n][m];
		qu = new LinkedList<>();

		for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				for (int l = 0; l < m; l++) {
					box[i][j][l] = sc.nextInt();
					if (box[i][j][l] == 1) {
						qu.add(new int[] { i, j , l});
					}
				}
			}
		}

		bfs(n, m, k);

		int maxDate = 0;
		loop_a: 
			for (int i = 0; i < k; i++) {
			for (int j = 0; j < n; j++) {
				for(int l = 0; l<m; l++) {
				if (box[i][j][l] == 0) {
					maxDate = 0;
					break loop_a;
				} else {
					maxDate = Math.max(maxDate, box[i][j][l]);
				}
			}}
		}
		System.out.println(maxDate - 1);
	}

	public static void bfs(int n, int m, int k) {
		int date = 0;
		int[][] directions = { { -1, 0 , 0}, { 1, 0 , 0}, { 0, -1 , 0}, { 0, 1 , 0}, {0,0,-1},{0,0,1} };

		while (!qu.isEmpty()) {
			int[] location = qu.poll();
			int z = location[0];
			int y = location[1];
			int x = location[2];
			date = box[z][y][x];

			for (int[] dir : directions) {
				int newZ = z + dir[0];
				int newY = y + dir[1];
				int newX = x + dir[2];

				if (newY >= 0 && newY < n && newX >= 0 && newX < m && newZ>= 0 && newZ<k && box[newZ][newY][newX] == 0) {
					box[newZ][newY][newX] = date + 1;
					qu.add(new int[] { newZ, newY, newX });
				}
			}
		}
	}
}