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

		int n = Integer.parseInt(br.readLine());
		Queue<Integer> goal = new LinkedList<>();
		Stack<Integer> st = new Stack<>();
		Queue<String> result = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			goal.offer(Integer.parseInt(br.readLine()));
		}

		int now = 1;
		int temp = goal.poll();
		int tempA = 0;
		while (goal.size() >= 0) {
			if (temp > now) {
				st.add(now);
				result.add("+");
				now++;
			} else if (temp == now) {
				result.add("+");
				result.add("-");
				if (goal.size() > 0) {
					temp = goal.poll();
					now++;
				} else {
					break;
				}
			} else {
				tempA = st.pop();
				if (tempA == temp) {
					result.add("-");
					if(goal.size() > 0) {
						temp = goal.poll();
					}else {
						break;
					}
				} else {
					result.clear();
					result.add("NO");
					break;
				}
			}
		}

		for (String x : result) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}

		bw.flush();

		br.close();
		bw.close();
	}
}