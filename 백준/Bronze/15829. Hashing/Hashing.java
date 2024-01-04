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

		int L = Integer.parseInt(br.readLine());
		String word = br.readLine();
		BigInteger[] change = new BigInteger[L];

		for (int i = 0; i < L; i++) {
            int temp = (int) word.charAt(i) - 'a' + 1;
            change[i] = BigInteger.valueOf(temp).multiply(BigInteger.valueOf(31).pow(i));
        }

        BigInteger sum = BigInteger.ZERO;
        for (BigInteger x : change) {
            sum = sum.add(x);
        }

        bw.write(String.valueOf(sum.mod(BigInteger.valueOf(1234567891))));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}
