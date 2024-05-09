import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder answer = new StringBuilder();

		String input = br.readLine();
		String[] nums = input.split(" ");
		long A = Long.parseLong(nums[0]);
		long B = Long.parseLong(nums[1]);

		long max = Math.max(A, B);
		long min = Math.min(A, B);

		int dif = (int) (max - min);
		if (dif == 0) {
			answer.append(0);
		} else {
			answer.append(dif - 1).append("\n");
		}
		for (int i = 1; i < dif; i++) {
			answer.append((long) (min + i) + " ");
		}

		bw.write(answer.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();

	}
}