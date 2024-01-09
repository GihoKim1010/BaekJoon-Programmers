import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<String, String> hs = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] input = br.readLine().split(" ");
			hs.put(input[0], input[1]);
		}
		ArrayList<String> result = new ArrayList<>();
		Set<String> keys = hs.keySet();
		for (String x : keys) {
			if (hs.get(x).equals("enter")) {
				result.add(x);
			}
		}

		Collections.sort(result, Collections.reverseOrder());

		for (String y : result) {
			bw.write(y);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}