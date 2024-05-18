import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int N, L, R;
	static int[][] nations;
	static boolean[][] visit;
	static int dir[][] = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };
	static boolean move;
	static int days;

	public static class Cur {
		int y;
		int x;

		Cur(int y, int x) {
			this.y=y;
			this.x=x;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = sc.nextInt();
		R = sc.nextInt();
		nations = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				nations[i][j] = sc.nextInt();
			}
		}
		days=0;
		move = true;
		while (move) {
			move=false;
			visit=new boolean[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visit[i][j]) {
						bfs(i, j);
					}
				}
			}
			
			if(move) {
				days++;
			}
		}
		
		System.out.println(days);
	}

	static void bfs(int y, int x) {
		Queue<Cur> qu = new LinkedList<>(); // bfs에 사용할 큐
		Queue<Cur> union = new LinkedList<>(); // 연합할 국가를 저장할 큐
		int sum = 0; // 연합의 인구총합
		qu.add(new Cur(y, x));
		union.add(new Cur(y,x));

		while (!qu.isEmpty()) {
			Cur now = qu.poll();
			visit[now.y][now.x] = true;
			sum += nations[now.y][now.x];

			for (int i = 0; i < 4; i++) {
				Cur next = new Cur(now.y + dir[i][0], now.x + dir[i][1]);
				if (next.y >= 0 && next.x >= 0 && next.y < N && next.x < N && !visit[next.y][next.x]) {
					int dif = Math.abs(nations[now.y][now.x] - nations[next.y][next.x]);
					if (dif >= L && dif <= R) {
						visit[next.y][next.x] = true;
						union.add(next);
						qu.add(next);
					}
				}
			}
		}
		
		int count = union.size();
		
		if(count>1) {
			move=true;
			while(!union.isEmpty()) {
				Cur calc = union.poll();
				nations[calc.y][calc.x]=(sum/count);
			}
		}
	}
}