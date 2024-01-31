import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] grade = new int[N];
		for (int i = 0; i < N; i++) {
			grade[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(grade);
		long sum = 0;
		for (int i = 0; i < N; i++) {
			sum += Math.abs((i + 1) - grade[i]);
		}

		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}