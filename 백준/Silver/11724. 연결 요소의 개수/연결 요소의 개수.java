import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static boolean[] visited;
	
	static void dfs(int node, HashMap<Integer, Queue<Integer>> hs) {
		visited[node]=true;
		
		if(hs.containsKey(node)) {
			for (int neighbor:hs.get(node)) {
				if(!visited[neighbor]) {
					dfs(neighbor, hs);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		HashMap<Integer, Queue<Integer>> hs = new HashMap<>();

		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			if (hs.containsKey(a)) {
				hs.get(a).add(b);
			} else {
				Queue<Integer> tempQu = new LinkedList<>();
				tempQu.add(b);
				hs.put(a, tempQu);
			}

			if (hs.containsKey(b)) {
				hs.get(b).add(a);
			} else {
				Queue<Integer> tempQu = new LinkedList<>();
				tempQu.add(a);
				hs.put(b, tempQu);
			}
		}

		int result =0;
		visited = new boolean[N+1];
		
		for(int i=1; i<=N; i++) {
			if(!visited[i]) {
				dfs(i, hs);
				result++;
			}
		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}