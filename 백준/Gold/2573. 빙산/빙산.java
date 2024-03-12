import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int n, m;
	public static int[][] ice;
	public static PriorityQueue<Integer> result;
	public static boolean plusOrMinus = false; // false면 홀수, true면 짝수
	public static int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ice = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ice[i][j] = sc.nextInt();
			}
		}

		int answer = 0, count=0;

		while (true) {
			answer++;

			if (answer % 2 == 1) {
				plusOrMinus = false;
			} else {
				plusOrMinus = true;
			}

			count = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if ((!plusOrMinus && ice[i][j] > 0)||(plusOrMinus && ice[i][j]<0)) {
						reduceIce(i, j);
					}
				}
			}
			removeIce();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if ((!plusOrMinus && ice[i][j] > 0)||(plusOrMinus && ice[i][j]<0)) {
						count++;
						bfs(i, j);
					}
				}
			}

			if (count == 0 || count >= 2) {
				break;
			}
		}
		
		if(count==0) {
			System.out.println(0);
		}else {
			System.out.println(answer);
		}
	}

	public static void reduceIce(int y, int x) {
		for (int[] dir : directions) {
			int newY = y + dir[0], newX = x + dir[1];
			if (newY >= 0 && newY < n && newX >= 0 && newX < m && ice[newY][newX] == 0 && ice[y][x] != 0) {

				if (!plusOrMinus) {
					ice[y][x]--;
				} else {
					ice[y][x]++;
				}
			}

			// 같은 해에 이미 0이된 공간이 옆 빙산에 영향을 안주도록 반대 부호로 임시저장.
			if (ice[y][x] == 0) {

				if (!plusOrMinus) {
					ice[y][x] = -1;
				} else {
					ice[y][x] = 1;
				}
			}
		}
	}

	public static void removeIce() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ((!plusOrMinus && ice[i][j] <= 0) ||(plusOrMinus && ice[i][j] >= 0))  {
					ice[i][j] = 0;
				} 
			}
		}
	}

	public static void bfs(int y, int x) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] { y, x });
		// 반대부호면 이미 visit 한것으로 가정.
		ice[y][x] *= -1;

		while (!qu.isEmpty()) {
			int temp[] = qu.poll();
			for (int[] dir : directions) {
				int newY = temp[0] + dir[0], newX = temp[1] + dir[1];
				if (newY >= 0 && newY < n && newX >= 0 && newX < m) {
					if ((ice[newY][newX] > 0 && !plusOrMinus) || (ice[newY][newX] < 0 && plusOrMinus)) {
						qu.add(new int[] { newY, newX });
						ice[newY][newX] *= -1;
					}
				}
			}
		}
	}
}