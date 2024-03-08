import java.util.Scanner;

public class Main {

	public static int[][] paper;
	public static int max = 0;
	public static boolean[][] visit;
	public static int n;
	public static int m;
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		paper = new int[n][m];
		visit = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				paper[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visit[i][j] = true;
				dfsExceptT(i, j, 1, paper[i][j]);
				visit[i][j] = false;
				calcT(i,j);
			}
		}

		System.out.println(max);
	}

	public static void dfsExceptT(int y, int x, int depth, int sum) {
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		if (depth == 4) {
			max = Math.max(max, sum);
			return;
		}

		for (int[] dir : directions) {
			int newY = y + dir[0];
			int newX = x + dir[1];

			if (newY >= 0 && newY <n && newX >= 0 && newX <m && !visit[newY][newX]) {
				visit[newY][newX] = true;
				dfsExceptT(newY, newX, depth + 1, sum + paper[newY][newX]);
				visit[newY][newX] = false;
			}
		}
	}

	public static void calcT(int y, int x) {
			
		if(y-1>=0 && y+1<n && x-1>=0) {
			max = Math.max(max,paper[y-1][x]+paper[y+1][x]+paper[y][x]+paper[y][x-1]);
		}
		
		if(y-1>=0 && y+1<n && x+1<m) {
			max = Math.max(max,paper[y-1][x]+paper[y+1][x]+paper[y][x]+paper[y][x+1]);
		}
		
		if(y-1>=0 && x-1>=0 && x+1<m) {
			max = Math.max(max,paper[y-1][x]+paper[y][x]+paper[y][x-1]+paper[y][x+1]);
		}
		
		if(y+1<n && x-1>=0 && x+1<m) {
			max = Math.max(max,paper[y+1][x]+paper[y][x]+paper[y][x-1]+paper[y][x+1]);
		}
	}
}