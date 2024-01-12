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

		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int M = Integer.parseInt(input[1]);
			
			BigInteger a =BigInteger.ONE;
			for(int j=1; j<=M; j++) {
				a =a.multiply(BigInteger.valueOf(j));
			}
			
			BigInteger b =BigInteger.ONE;
			for(int j=1; j<=(M-N); j++) {
				b =b.multiply(BigInteger.valueOf(j));;
			}
			
			BigInteger c =BigInteger.ONE;
			for(int j=1; j<=N; j++) {
				c =c.multiply(BigInteger.valueOf(j));
			}
			
			result.append(a.divide(b).divide(c)).append("\n");
		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}