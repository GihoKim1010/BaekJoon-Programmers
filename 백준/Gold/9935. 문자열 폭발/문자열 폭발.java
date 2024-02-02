import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();
		String bomb = br.readLine();
		Deque<String> st = new LinkedList<>();
		Stack<String> st2 = new Stack<>();
		Stack<String> judge = new Stack<>();
		Stack<String> judge2 = new Stack<>();

		for (int i = 0; i < bomb.length(); i++) {
			judge.add(String.valueOf(bomb.charAt(i)));
		}

		for (int i = 0; i < input.length(); i++) {
			st.addLast(String.valueOf(input.charAt(i)));
			while (!judge.isEmpty() && !st.isEmpty()) {
				if (judge.peek().equals(st.peekLast())) {
					judge2.add(judge.pop());
					st2.add(st.pollLast());
				} else{
					while(!st2.isEmpty()) {
						st.addLast(st2.pop());
					}
					break;
				}
			}
			if(judge.isEmpty()) {
				st2.clear();
			}else {
				while(!st2.isEmpty()) {
					st.addLast(st2.pop());
				}
			}
			while (!judge2.isEmpty()) {
				judge.add(judge2.pop());
			}
		}
		StringBuilder result = new StringBuilder();
		while (!st.isEmpty()) {
			result.append(st.pollFirst());
		}
		String answer = result.toString();
		if(answer.isEmpty()) {
			answer="FRULA";
		}

		bw.write(answer);
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}