import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int[] result = new int[T];

		for (int i = 0; i < T; i++) {
			int test = Integer.parseInt(br.readLine());
			boolean[] num = new boolean[test + 1]; // false로 남은게 소수
			num[0] = true;
			num[1] = true;

			for (int j = 2; j * j <= num.length; j++) {
				if (!num[j]) {
					int temp = 2;
					while (temp * j < num.length - 1) {
						num[temp * j] = true;
						temp++;
					}
				}
			}
			int count = 0;
			for (int j = 2; j < num.length/2+1; j++) {
				if (!num[j] && !num[test - j]) {
					count++;
				}
			}

			result[i] = count;
		}

		for (int x : result) {
			bw.write(String.valueOf(x));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}