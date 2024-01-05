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
		int K = Integer.parseInt(firstLine[0]);
		int N = Integer.parseInt(firstLine[1]);

		long[] cable = new long[K];
		long min_length = 1L;
		long max_length = 0L;

		for (int i = 0; i < K; i++) {
			cable[i] = Long.parseLong(br.readLine());
			max_length = Math.max(max_length, cable[i]);
		}

		long mid = 0L;
		
		while (min_length<=max_length) {
			mid = (min_length + max_length)/2L;
			long count = 0L;

			for (int i = 0; i < K; i++) {
				count += (cable[i] / mid);
			}
			
			 if (count >= N) {
				min_length = mid+1;
			} else if (count < N) {
				max_length = mid-1;

			}
		}

		bw.write(String.valueOf(max_length));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}