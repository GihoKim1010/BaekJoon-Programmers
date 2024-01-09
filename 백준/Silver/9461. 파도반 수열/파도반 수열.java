import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long[] pn = new long[101];
		pn[1] = 1;
		pn[2] = 1;
		pn[3] = 1;
		pn[4] = 2;
		pn[5] = 2;

		for (int i = 6; i <= 100; i++) {
			pn[i] = pn[i - 1] + pn[i - 5];
		}

		int T = Integer.parseInt(br.readLine());
		long[] result = new long[T];

		for (int i = 0; i < T; i++) {
			result[i] = pn[Integer.parseInt(br.readLine())];
		}

		for (long x : result) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}