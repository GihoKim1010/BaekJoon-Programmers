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
			int k = Integer.parseInt(br.readLine()); // k층
			int n = Integer.parseInt(br.readLine()); // n호
			// k-1층의 1~n호까지의 사람 수 합만큼 데려와 살아야함.
			// 0층 존재. 0층 i호에는 i명 삶.

			int[][] house = new int[k + 1][n + 1];
			for (int j = 0; j < k + 1; j++) {
				house[j][0] = 0;
			}
			for (int j = 0; j < n + 1; j++) {
				house[0][j] = j;
			}
			for (int j = 1; j < k + 1; j++) {
				for (int l = 1; l < n + 1; l++) {
					house[j][l] = house[j - 1][l] + house[j][l - 1];
				}
			}
			result[i] = house[k][n];
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