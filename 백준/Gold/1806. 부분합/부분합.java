import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String ns = br.readLine();
		String[] temp = ns.split(" ");
		int n = Integer.parseInt(temp[0]);
		int s = Integer.parseInt(temp[1]);
		long[] sum = new long[n + 1];
		String seq = br.readLine();
		String[] temp2 = seq.split(" ");
		sum[0] = 0L;
		for (int i = 1; i <= n; i++) {
			sum[i] = Long.parseLong(temp2[i - 1]) + sum[i - 1];
		}

		int left = 0;
		int right = 1;
		int length = n + 1;

		while (sum[right]-sum[left] >= s || right != n) {
			if (sum[right] - sum[left] < s) {
				right++;
			} else if (sum[right] - sum[left] >= s) {
				length = Math.min(length, right - left);
				left++;
			}
		}

		if (length == n + 1) {
			length = 0;
		}

		bw.write(String.valueOf(length));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}