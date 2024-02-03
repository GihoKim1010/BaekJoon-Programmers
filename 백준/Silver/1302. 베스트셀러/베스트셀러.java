import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> books = new HashMap<>();
		
		for(int i =0; i<N; i++) {
			String input = br.readLine();
			books.put(input, books.getOrDefault(input, 0)+1);
		}
		ArrayList<String[]> countBooks = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : books.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			String[] counts = {key, String.valueOf(value)};
			countBooks.add(counts);
		}
		
		Collections.sort(countBooks, Comparator.<String[], Integer>comparing(ar->Integer.valueOf(ar[1])).reversed().thenComparing(ar->ar[0]).reversed());
		
		bw.write(String.valueOf(countBooks.get(countBooks.size()-1)[0]));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}