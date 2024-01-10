import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	
	static ArrayList<Integer>[] graph;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		visit = new boolean[N + 1];
		graph = new ArrayList[N + 1];
		
		for(int i =1; i<=N; i++) {
			graph[i]=new ArrayList<>();
		}

		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			graph[a].add(b);
			graph[b].add(a);
		}

		int result=dfs(1);
		
		bw.write(String.valueOf(result-1));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();

	}

	static int dfs(int node) { // 문제에서 1번컴퓨터가 감염 시작이므로, main에서 node=1을 대입할 예정.
		visit[node] = true; // true = node 에 해당하는 컴퓨터와 다른 컴퓨터간 연결여부를 확인했음.
		int count = 1; // 현재 컴퓨터가 이미 감염되었으므로 1대가 초기값.

		for (int connect : graph[node]) { // node에 해당하는 컴퓨터에 대해 모든 값을 for문으로 돌림
			if (!visit[connect]) { // 검사중인 컴퓨터와의 연결을 확인하지 않았을 경우
				count += dfs(connect); // 연결된(graph에 있는) 다른 컴퓨터에 대해 재귀호출.
			}
		}

		return count; // 재귀 호출 된 수만큼 count가 쌓임.(count=감염된 수)
	}

}