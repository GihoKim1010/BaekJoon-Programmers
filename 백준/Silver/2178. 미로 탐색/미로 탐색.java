import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static boolean[][] maze;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		maze = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				if (input.charAt(j) == '1') {
					maze[i][j] = true;
				}
			}
		}

		System.out.println(bfs(0, 0, n, m));
	}

	public static int bfs(int x, int y, int n, int m) {
		Queue<int[]> qu = new LinkedList<>();
		int[] temp = { y, x };
		qu.add(temp);
		int count = 1; // 시작 지점도 카운트에 포함
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // 상하좌우 이동

		while (!qu.isEmpty()) {
			int size = qu.size(); // 현재 레벨의 노드 수
			for (int i = 0; i < size; i++) {
				temp = qu.poll();
				y = temp[0];
				x = temp[1];

				for (int[] dir : directions) {
					int newY = y + dir[0];
					int newX = x + dir[1];
					if (newY >= 0 && newY < n && newX >= 0 && newX < m && maze[newY][newX]) {
						if (newY == n - 1 && newX == m - 1) { // 목적지에 도달하면 종료
							return count + 1; // 마지막 지점 가는 +1
						}
						qu.add(new int[] { newY, newX });
						maze[newY][newX] = false; // 방문한 곳은 다시 방문하지 않도록
					}
				}
			}
			count++; // 다음 레벨로 진행
		}
		return count;
	}
}