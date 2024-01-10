import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void star(int n) {

	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstLine = br.readLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		int[] result = new int[M];

		int[][] sum = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			String[] input = br.readLine().split(" ");
			int temp = 0;
			for (int j = 1; j <= N; j++) {
				temp = temp + Integer.parseInt(input[j-1]);
				sum[i][j] = temp;
			}
		}

		for (int i = 0; i < M; i++) {
			String[] output = br.readLine().split(" ");
			int x1 = Integer.parseInt(output[0]);
			int y1 = Integer.parseInt(output[1]);
			int x2 = Integer.parseInt(output[2]);
			int y2 = Integer.parseInt(output[3]);
			for (int j = x1; j <= x2; j++) {
				result[i] += sum[j][y2] - sum[j][y1-1];
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