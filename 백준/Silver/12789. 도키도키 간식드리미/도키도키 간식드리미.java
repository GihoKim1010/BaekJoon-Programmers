import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> originLine = new Stack<>();
		Stack<Integer> newLine = new Stack<>();

		String result = " ";
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < temp.length; i++) {
			originLine.add(Integer.parseInt(temp[temp.length - i - 1]));
		}

		int order = 1;
		while (true) {
			if (!originLine.isEmpty()) {
				int tempA = originLine.pop();
				if (tempA == order) { // 원래줄이 받을차례
					order++;
				} else { // 원래줄이 받을차례가 아니었음.
					if (!newLine.isEmpty()) {
						int tempB = newLine.pop();
						if (tempB == order) { // 새 줄이 받을 차례였음.
							order++;
							originLine.add(tempA);
						} else { // 둘 다 아니어서 새 줄로 옮겨감.
							newLine.add(tempB);
							newLine.add(tempA);
						}
					} else { // 새 줄이 비어있었음.
						newLine.add(tempA);
					}
				}
			} else { // 원래줄이 비었음.
				if (newLine.isEmpty()) { // 새 줄도 비었음.
					result = "Nice";
					break;
				} else { // 새 줄은 안비어서 마저 봐야함.
					int tempB = newLine.pop();
					if (tempB == order) { // 새 줄이 받을 차례였음.
						order++;
					} else {
						result = "Sad";
						break;
					}
				}
			}
		}
		bw.write(result);
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}