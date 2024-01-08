import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		int[] result = new int[M];

		String[] secondLine = br.readLine().split(" ");
		int[] numbers = new int[N];
		int[] sum = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(secondLine[i]);
			if (i == 0) {
				sum[0] = numbers[0];
			} else {
				sum[i] = numbers[i] + sum[i - 1];
			}
		}

		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			if (a == 1) {
				result[i] = sum[b - 1];
			} else {
				result[i] = sum[b - 1] - sum[a - 2];
			}
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