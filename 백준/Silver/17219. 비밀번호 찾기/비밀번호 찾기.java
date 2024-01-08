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

		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		String[] result = new String[M];

		HashMap<String, String> site = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			site.put(temp[0], temp[1]);
		}

		for (int i = 0; i < M; i++) {
			result[i] = site.get(br.readLine());
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