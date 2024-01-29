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

		int[] count = new int[9];

		int number = Integer.parseInt(br.readLine());
		while (number != 0) {
			int temp = number % 10;
			number /= 10;
			if (temp == 9) {
				count[6]++;
			} else {
				count[temp]++;
			}
		}

		if (count[6] % 2 == 1) {
			count[6] =count[6]/2 + 1;
		} else {
			count[6] /= 2;
		}
		Arrays.sort(count);

		bw.write(String.valueOf(count[8]));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}