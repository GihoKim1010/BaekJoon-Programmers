import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static boolean[][] visit;
	public static Queue<int[]> people;
	public static Queue<int[]> location;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		visit = new boolean[n][m];
		people = new LinkedList<>();
		location = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				if (input.charAt(j) == 'P') {
					people.add(new int[] { i, j });
				} else if (input.charAt(j) == 'X') {
					visit[i][j] = true;
				} else if (input.charAt(j) == 'I') {
					location.add(new int[] { i, j });
					visit[i][j] = true;
				}
			}
		}

		bfs(n, m);
		int count=0;

		while(!people.isEmpty()) {
			int[] x = people.poll();
			if(visit[x[0]][x[1]]) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println("TT");
		}else {
			System.out.println(count);
		}
	}

	public static void bfs(int n, int m) {
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!location.isEmpty()) {
			int[] now = location.poll();
			int y = now[0];
			int x = now[1];

			for (int[] dir : directions) {
				int newY = y + dir[0];
				int newX = x + dir[1];

				if (newY >= 0 && newY < n && newX >= 0 && newX < m && !visit[newY][newX]) {
					location.add(new int[] { newY, newX });
					visit[newY][newX] = true;
				}
			}
		}
	}
}