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

		Queue<String> result = new LinkedList<>();

		while (true) {

			Stack<String> st = new Stack<>();

			String input = br.readLine();

			if (input.equals(".")) {
				break;
			}
			
			int judge=0;

			for (int i = 0; i < input.length(); i++) {
				String temp = String.valueOf(input.charAt(i));

				if (temp.equals("(") || temp.equals("[")) {
					st.add(temp);
				} else if (temp.equals(")")) {
					if (st.size() == 0) {
						st.clear();
						result.add("no");
						judge++;
						break;
					} else {
						String a = st.pop();
						if (a.equals("[")) {
							st.clear();
							result.add("no");
							judge++;
							break;
						}
					}
				} else if (temp.equals("]")) {
					if (st.size() == 0) {
						st.clear();
						result.add("no");
						judge++;
						break;
					} else {
						String a = st.pop();
						if (a.equals("(")) {
							st.clear();
							result.add("no");
							judge++;
							break;
						}
					}
				}
			}

			if (st.size() == 0 && judge==0) {
				result.add("yes");
			}else if(st.size()>0) {
				result.add("no");
			}
		}

		for (String x : result) {
			bw.write(x);
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}