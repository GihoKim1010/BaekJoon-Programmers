import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> qu = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();
		int backValue=0;

		for (int i = 0; i < N; i++) {
			String[] order = br.readLine().split(" ");

			switch (order[0]) {
			case "push":
				qu.add(Integer.parseInt(order[1]));
				backValue=Integer.parseInt(order[1]);
				break;
			case "pop":
				result.append(qu.isEmpty() ? -1 : qu.poll()).append("\n");
				break;
			case "size":
				result.append(qu.size()).append("\n");
				break;
			case "empty":
				result.append(qu.isEmpty() ? 1 : 0).append("\n");
				break;
			case "front":
				result.append(qu.isEmpty() ? -1 : qu.peek()).append("\n");
				break;
			case "back":
				result.append(qu.isEmpty() ? -1 : backValue).append("\n");
				break;
			}

		}

		bw.write(String.valueOf(result.toString()));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}