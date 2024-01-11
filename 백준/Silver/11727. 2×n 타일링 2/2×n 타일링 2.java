import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		long result = 0;

		if (n == 1) {
			result = 1;
		} else if (n == 2) {
			result = 3;
		} else {
			long[] x = new long[n + 1];
			x[1] = 1;
			x[2] = 3;
			for (int i = 3; i <= n; i++) {
				x[i] = x[i - 1]%10007 + (2 * x[i - 2])%10007;
			}
			result = x[n];
		}

		bw.write(String.valueOf(result % 10007));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}