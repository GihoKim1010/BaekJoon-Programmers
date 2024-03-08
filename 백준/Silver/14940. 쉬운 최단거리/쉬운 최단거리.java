import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[][] map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		map = new int[n][m];
		int startX = 0, startY = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				int input = sc.nextInt();
				if (input == 2) {
					// 출발지 -2로 저장
					startX = j;
					startY = i;
				} else if (input == 1) {
					map[i][j] = -1;
				}
			}
		}

		bfs(n, m, startX, startY);
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result.append(map[i][j]+" ");
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

	public static void bfs(int n, int m, int startX, int startY) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] { startY, startX });
		int count = 0;
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!qu.isEmpty()) {
			int[] temp = qu.poll();
			startY = temp[0];
			startX = temp[1];
			count = map[startY][startX];

			for (int[] dir : directions) {
				int newY = startY + dir[0];
				int newX = startX + dir[1];

				if (newY >= 0 && newY < n && newX >= 0 && newX < m && map[newY][newX]==-1) {
					qu.add(new int[] { newY, newX });
					map[newY][newX] = count + 1;
				}
			}
		}
	}
}