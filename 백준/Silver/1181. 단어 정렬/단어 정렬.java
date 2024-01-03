import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		String[] word = new String[N];

		for (int i = 0; i < N; i++) {
			word[i] = br.readLine();
		}

		Arrays.sort(word, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

		bw.write(word[0]);
		bw.newLine();

		for (int i = 0; i < N - 1; i++) {
			if (!word[i].equals(word[i + 1])) {
				bw.write(word[i + 1]);
				bw.newLine();
			}
		}
		bw.flush();

		br.close();
		bw.close();
	}
}