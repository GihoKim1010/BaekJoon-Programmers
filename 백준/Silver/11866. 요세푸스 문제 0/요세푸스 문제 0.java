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

		String input = br.readLine();
		String[] temp = input.split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		Queue<Integer> list = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			list.offer(i);
		}

		while (list.size() > 0) {
			for (int i = 0; i < K - 1; i++) {
				int a = list.poll();
				list.offer(a);
			}
			int b = list.poll();
			result.offer(b);
		}

		String output = "<" + result.poll();
		
		for(int i=0; i<N-1; i++) {
			output=output+", "+result.poll();
		}

		bw.write(output+">");
		bw.newLine();

		bw.flush();

		br.close();
		bw.close();
	}
}