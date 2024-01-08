import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.valueOf(br.readLine());
		int[] count = new int[n+1];

		if (n == 1) {
			bw.write("1");
		} else if (n == 2) {
			bw.write("2");
		} else {
			count[1] = 1;
			count[2] = 2;
			for (int i = 3; i <= n; i++) {
				count[i] = (count[i - 1] + count[i - 2])%10007;
			}
			bw.write(String.valueOf(count[n] % 10007));
		}
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}