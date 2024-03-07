import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static StringBuilder answer;
	public static boolean[] visit;
	public static boolean[][] graph;
	public static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int m = sc.nextInt(), v = sc.nextInt();
		graph = new boolean[n + 1][n + 1];
		answer = new StringBuilder();

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			graph[a][b] = graph[b][a] = true;
		}

		visit = new boolean[n + 1];
		dfs(v);
		answer.append("\n");

		visit = new boolean[n + 1];
		bfs(v);
		
		System.out.println(answer.toString());
	}

	public static void dfs(int v) {
		answer.append(v + " ");
		visit[v] = true;

		for (int i = 1; i <= n; i++) {
			if (graph[v][i] && !visit[i]) {
				dfs(i);
			}
		}
	}

	public static void bfs(int v) {
		Queue<Integer> qu = new LinkedList<>();
		qu.add(v);
		visit[v]=true;
		
		while(!qu.isEmpty()) {
			v = qu.poll();
			answer.append(v + " ");
			
			for(int i=1; i<=n; i++) {
				if(graph[v][i] && !visit[i]) {
					qu.add(i);
					visit[i]=true;
				}
			}
		}
	}
}