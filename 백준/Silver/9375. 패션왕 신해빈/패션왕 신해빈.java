import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			int M = Integer.parseInt(br.readLine());
			HashMap<String, Integer> hs = new HashMap<>();
			for (int j = 0; j < M; j++) {
			String[] input = br.readLine().split(" ");
				if (hs.containsKey(input[1])) {
					hs.put(input[1], hs.get(input[1]) + 1);
				}else {
					hs.put(input[1], 1);
				}
			}
			Collection<Integer> value = hs.values();
			int temp = 1;
			for (int x : value) {
				temp *= (x + 1);
			}
			result[i] = temp - 1;
		}

		for (int y : result) {
			bw.write(String.valueOf(y));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}