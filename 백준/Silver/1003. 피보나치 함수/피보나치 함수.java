import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.valueOf(br.readLine());

		for (int i = 0; i < N; i++) {
			int test = Integer.parseInt(br.readLine());

			if (test == 0) {
				bw.write("1 0");
				bw.newLine();
			} else if (test == 1) {
				bw.write("0 1");
				bw.newLine();
			} else {
				int[] list = new int[test+1];
				list[0] = 0;
				list[1] = 1;

				for (int j = 2; j <= test; j++) {
					list[j] = list[j - 1] + list[j - 2];
				}
				bw.write(list[test - 1] + " " + list[test]);
				bw.newLine();
			}
		}

		bw.flush();

		br.close();
		bw.close();
	}
}