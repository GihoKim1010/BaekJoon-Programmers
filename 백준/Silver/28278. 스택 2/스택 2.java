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
		Queue<Integer> result = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			int order = Integer.parseInt(input[0]);
			if (order == 1) {
				st.add(Integer.parseInt(input[1]));
			} else if (order == 2) {
				if (st.isEmpty()) {
					result.add(-1);
				} else {
					result.add(st.pop());
				}
			} else if (order == 3) {
				result.add(st.size());
			} else if (order == 4) {
				if (st.isEmpty()) {
					result.add(1);
				} else {
					result.add(0);
				}
			} else if (order == 5) {
				if (st.isEmpty()) {
					result.add(-1);
				} else {
					int temp = st.pop();
					result.add(temp);
					st.add(temp);
				}
			}
		}

		for (int x : result) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}