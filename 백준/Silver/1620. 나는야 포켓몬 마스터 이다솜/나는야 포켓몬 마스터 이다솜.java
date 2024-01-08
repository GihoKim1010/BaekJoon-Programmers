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
		int N = Integer.parseInt(firstLine[0]); // 도감 수록 포켓몬 수
		int M = Integer.parseInt(firstLine[1]); // 맞춰야하는 문제 수
		String[] list = new String[N];
		String[] result = new String[M];

		HashMap<String, Integer> pokedex = new HashMap<>();
		for (int i = 0; i < N; i++) {
			list[i] = br.readLine();
			pokedex.put(list[i], i + 1);
		}

		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			if (pokedex.containsKey(input)) {
				result[i] = String.valueOf(pokedex.get(input));
			} else {
				int temp=Integer.valueOf(input);
				result[i] = list[temp - 1];
			}
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