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

		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> x = new HashMap<>();
		TreeSet<Integer> y = new TreeSet<>();
		String[] secondLine = br.readLine().split(" ");
		int[] numbers = new int[N];
		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(secondLine[i]);
			y.add(numbers[i]);
		}

		int z = 0;
		int size=y.size();
		for (int i = 0; i < size; i++) {
			int temp = y.pollFirst();
			x.put(temp, z);
			z++;
		}

		for (int i = 0; i < N; i++) {
			if (x.containsKey(numbers[i])) {
				result[i] = x.get(numbers[i]);
			}
		}

		for (int a : result) {
			bw.write(String.valueOf(a+ " "));
		}
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}