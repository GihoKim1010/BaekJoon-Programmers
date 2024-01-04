import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] result = new String[N];

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String temp = input;

			while (temp.contains("()")) {
				temp = temp.replace("()", "");
			}

			if (temp.length() == 0) {
				result[i] = "YES";
			} else {
				result[i] = "NO";
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