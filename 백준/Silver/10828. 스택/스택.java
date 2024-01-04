import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		Queue<String> output = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");

			if (temp.length == 2) {
				st.push(Integer.parseInt(temp[1]));
			} else if (input.equals("pop")) {
				if (st.empty()) {
					output.offer(String.valueOf(-1));
				} else {
					output.offer(String.valueOf(st.pop()));
				}
			} else if (input.equals("size")) {
				output.offer(String.valueOf(st.size()));
			} else if (input.equals("empty")) {
				if (st.empty()) {
					output.offer(String.valueOf(1));
				} else {
					output.offer(String.valueOf(0));
				}
			} else if (input.equals("top")) {
				if (st.empty()) {
					output.offer(String.valueOf(-1));
				} else {
					String a = String.valueOf(st.pop());
					output.offer(a);
					st.push(Integer.parseInt(a));
					for (int j = 0; j < st.size() - 1; j++) {
						int b = st.pop();
						st.push(b);
					}
				}
			}
		}
		for (String x : output) {
			bw.write(x);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
