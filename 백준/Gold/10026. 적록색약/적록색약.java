import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static Queue<int[]> qu;
	public static String[][] picture;
	public static boolean[][] visit;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		// 일반인이 본 사진과, 색약인이 본 사진
		picture = new String[n][n];
		visit = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < n; j++) {
				picture[i][j] = String.valueOf(input.charAt(j));
			}
		}
		System.out.print(bfs(n)+" ");
		
		visit = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(picture[i][j].equals("R")) {
					picture[i][j]="G";
				}
			}
		}
		System.out.print(bfs(n));
	}

	public static int bfs(int n) {
		qu = new LinkedList<>();
		int[][] direction = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
		int count=0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visit[i][j]) {
					count++;
					qu.add(new int[] { i, j});
					while (!qu.isEmpty()) {
						int[] temp = qu.poll();
						int y = temp[0];
						int x = temp[1];
						String color = picture[y][x];

						for (int[] dir : direction) {
							int newY = y + dir[0];
							int newX = x + dir[1];

							if (newY >= 0 && newY < n && newX >= 0 && newX < n && !visit[newY][newX]
									&& picture[newY][newX].equals(color)) {
								visit[newY][newX] = true;
								qu.add(new int[] { newY, newX });
							}
						}
					}
				}
			}
		}
		return count;
	}
}