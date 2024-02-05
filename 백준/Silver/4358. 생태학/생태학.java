import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<String, Integer> trees = new HashMap<>();
		TreeSet<String> ts = new TreeSet<>();
		String input;
		double count = 0;
		while ((input = br.readLine()) != null) {
			count++;
			trees.put(input, trees.getOrDefault(input, 0) + 1);
			ts.add(input);
		}
		StringBuilder result = new StringBuilder();
		for (String x : ts) {
			result.append(x + " ").append(String.format("%.4f",(double) 100 * trees.get(x) / count)).append("\n");
		}

		System.out.println(result.toString());
	}
}