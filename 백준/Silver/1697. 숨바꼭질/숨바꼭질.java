import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[] visit;
	public static int count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		// 1초에 1칸 이동하거나, 좌표*2로 이동.
		count = 0;

		if (n == k) {
			count = 0;
		} else if (n > k) {
			count = n - k;
		} else {
			// 배열 크기 최소화 하기 위해 숫자를 줄임
			visit = new int[2 * k + 1];
			count = bfs(n, k);
		}
		System.out.println(count);
	}

	public static int bfs(int start, int end) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(start);
		count = 0;
		visit[0] = count;

		while (!qu.isEmpty()) {
			int x = qu.poll();
			count = visit[x];

			if (x - 1 >= 0 && visit[x - 1] == 0) {
				qu.add(x - 1);
				visit[x - 1] = count + 1;
			}

			if (x + 1 < visit.length && visit[x + 1] == 0) {
				qu.add(x + 1);
				visit[x + 1] = count + 1;
			}

			if (2 * x < visit.length && visit[2 * x] == 0) {
				qu.add(2 * x);
				visit[2 * x] = count + 1;
			}

			if (visit[end] != 0) {
				return visit[end];
			}
		}
		return count;
	}
}