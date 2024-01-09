import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		HashMap<String, Integer> S = new HashMap<>();
		int result = 0;

		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			S.put(temp, 1);
		}

		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			if (S.containsKey(temp)) {
				result++;
			}
		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}