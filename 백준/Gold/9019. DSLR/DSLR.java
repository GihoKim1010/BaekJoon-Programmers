import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static String[] visit;
	public static Queue<Integer> qu;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int from = sc.nextInt(), to = sc.nextInt();
			visit = new String[10000];
			visit[from]="X";
			bfs(from, to);
			answer.append(visit[to]+"\n");
		}
		System.out.println(answer.toString());
	}

	public static void bfs(int from, int to) {
		qu = new LinkedList<>();
		qu.add(from);

		while (!qu.isEmpty()) {
			int now = qu.poll();

			if (now == to) {
				break;
			}

			int d = calcD(now), s = calcS(now), l = calcL(now), r = calcR(now);
			if (visit[d]==null) {
				qu.add(d);
				visit[d] = makeResult(visit[now], "D");
			}
			if (visit[s]==null) {
				qu.add(s);
				visit[s] = makeResult(visit[now], "S");
			}
			if (visit[l]==null) {
				qu.add(l);
				visit[l] = makeResult(visit[now], "L");
			}
			if (visit[r]==null) {
				qu.add(r);
				visit[r] = makeResult(visit[now], "R");
			}
		}
	}
	
	public static String makeResult(String x, String add) {
		StringBuilder result = new StringBuilder();
		if(x!=null && x!="X") {
			result.append(x);
		}
		result.append(add);
		return result.toString();
	}

	public static int calcD(int n) {
		return (n * 2) % 10000;
	}

	public static int calcS(int n) {
		return (n + 9999) % 10000;
	}

	public static int calcL(int n) {
		int temp = n / 1000;
		return n * 10 % 10000 + temp;
	}

	public static int calcR(int n) {
		int temp = n % 10 * 1000;
		return n / 10 + temp;
	}
}