import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			String order = br.readLine();
			int no = Integer.parseInt(br.readLine());
			String input = br.readLine();
			input = input.replace("[", "").replace("]", "");
			String[] numbers = input.split(",");
			Deque<String> de = new LinkedList<>();

			// 덱에 숫자만 골라서 넣었음
			if (no > 1) {
				for (int j = 0; j < numbers.length; j++) {
					de.addLast((numbers[j]));
				}

				boolean judge = true; // true : 정방향인상황 / false : 역방향인상황
				boolean error = false;
				for (int j = 0; j < order.length(); j++) {
					char temp = order.charAt(j);
					String todo = String.valueOf(temp);
					if (todo.equals("R")) {
						if (judge) {
							judge = false;
						} else if (!judge) {
							judge = true;
						}
					} else if (todo.equals("D")) {
						if (judge) {
							if (de.isEmpty()) {
								result.append("error").append("\n");
								error = true;
								break;
							} else {
								de.pollFirst();
							}
						} else if (!judge) {
							if (de.isEmpty()) {
								result.append("error").append("\n");
								error = true;
								break;
							} else {
								de.pollLast();
							}
						}
					}
				}

				if (error) {
					continue;
				} else if (!error && judge) {
					if (!de.isEmpty()) {
						result.append("[").append(de.pollFirst());
					} else {
						result.append("[");
					}
					while (!de.isEmpty()) {
						result.append(",").append(de.pollFirst());
					}
					result.append("]").append("\n");
				} else if (!error && !judge) {
					if (!de.isEmpty()) {
						result.append("[").append(de.pollLast());
					} else {
						result.append("[");
					}
					while (!de.isEmpty()) {
						result.append(",").append(de.pollLast());
					}
					result.append("]").append("\n");
				}
			} else if (no == 1) {
				String tempResult = "[" + numbers[0] + "]";
				for (int j = 0; j < order.length(); j++) {
					char temp = order.charAt(j);
					String todo = String.valueOf(temp);
					if (todo.equals("D")) {
						if(tempResult.equals("[]")) {
							tempResult = "error";
							break;
						}else {
							tempResult="[]";
						}
					}
				}
				result.append(tempResult).append("\n");
			} else if (no == 0) {
				String tempResult = "[]";
				for (int j = 0; j < order.length(); j++) {
					char temp = order.charAt(j);
					String todo = String.valueOf(temp);
					if (todo.equals("D")) {
						tempResult = "error";
						break;
					}
				}
				result.append(tempResult).append("\n");
			}
		}

		bw.write(String.valueOf(result.toString()));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}