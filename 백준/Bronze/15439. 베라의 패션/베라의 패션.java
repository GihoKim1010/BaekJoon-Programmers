import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;

		if (N == 1) {
			result.append(0);
		} else {
			for (int i = 1; i <= N; i++) {
				a = a.multiply(BigInteger.valueOf(i));
			}
			for (int i = 1; i <= (N - 2); i++) {
				b = b.multiply(BigInteger.valueOf(i));
			}
			result.append(a.divide(b));
		}
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}