import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Deque<Integer> list = new LinkedList<>();
		Queue<String> result = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");

			if (temp.length == 2 && temp[0].equals("push_front")) {
				list.addFirst(Integer.parseInt(temp[1]));
			} else if (temp.length == 2 && temp[0].equals("push_back")) {
				list.addLast(Integer.parseInt(temp[1]));
			} else if (input.equals("pop_front")) {
				if (list.size() == 0) {
					result.add("-1");
				} else {
					int a = list.pollFirst();
					result.add(String.valueOf(a));
				}
			} else if (input.equals("pop_back")) {
				if (list.size() == 0) {
					result.add("-1");
				} else {
					int a = list.pollLast();
					result.add(String.valueOf(a));
				}
			} else if (input.equals("size")) {
				result.add(String.valueOf(list.size()));
			} else if (input.equals("empty")) {
				if (list.size() == 0) {
					result.add("1");
				} else {
					result.add("0");
				}
			} else if (input.equals("front")) {
				if (list.size() == 0) {
					result.add("-1");
				} else {
					int a = list.pollFirst();
					result.add(String.valueOf(a));
					list.addFirst(a);
				}
			} else if (input.equals("back")) {
				if (list.size() == 0) {
					result.add("-1");
				} else {
					int a = list.pollLast();
					result.add(String.valueOf(a));
					list.addLast(a);
				}
			}
		}

		for (String b : result) {
			bw.write(b);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}