import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		Map<String, Integer> hs = new HashMap<>();
		List<String> ar = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String input = br.readLine();

			if (input.length() >= M && hs.containsKey(input)) {
				hs.put(input, hs.get(input) + 1);
			} else if (input.length() >= M && !hs.containsKey(input)) {
				hs.put(input, 1);
				ar.add(input);
			}
		}

		Collections.sort(ar, new Comparator<String>() {
			@Override

			public int compare(String o1, String o2) {
		        // 자주 등장하는 단어 순서대로 정렬
		        if (Integer.compare(hs.get(o1), hs.get(o2)) != 0) {
		            return Integer.compare(hs.get(o2), hs.get(o1));
		        }
		        // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
		        if (o1.length() != o2.length()) {
		            return o2.length() - o1.length();
		        }
		        // 등장 횟수와 길이가 같으면 사전 순으로 정렬
		        return o1.compareTo(o2);
		    }
		});

		StringBuilder result = new StringBuilder();

		for (String x : ar) {
			result.append(x).append("\n");
		}
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}