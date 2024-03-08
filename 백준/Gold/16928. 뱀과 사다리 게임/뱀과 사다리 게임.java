import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[] map;
	public static HashMap<Integer, Integer> ladderAndSnake;
	public static boolean[] hasLadderOrSnake;
	public static Queue<Integer> qu;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();

		map = new int[101];
		hasLadderOrSnake = new boolean[101];
		ladderAndSnake = new HashMap<>();
		qu = new LinkedList<>();
		qu.add(1);

		for (int i = 0; i < n + m; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			ladderAndSnake.put(from, to);
			hasLadderOrSnake[from] = true;
		}

		bfs();
		System.out.println(map[100]);
	}

	public static void bfs() {
		int count = 0;
		while (!qu.isEmpty() && map[100] == 0) {
			int now = qu.poll();
			count = map[now];
			for (int i = 1; i <= 6; i++) {
				if (now + i < 100 && map[now + i] == 0) {
					map[now + i] = count + 1;
					if (hasLadderOrSnake[now + i]) {
						qu.add(ladderAndSnake.get(now + i));
						if (map[ladderAndSnake.get(now + i)] == 0) {
							map[ladderAndSnake.get(now + i)] = count + 1;
						}
					} else {
						qu.add(now + i);
					}
				} else if (now + i == 100) {
					map[100] = count + 1;
					break;
				}
			}
		}
	}
}