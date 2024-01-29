import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String first = br.readLine();
		String[] temp = first.split(" ");
		int N = Integer.parseInt(temp[0]);
		int M = Integer.parseInt(temp[1]);

		long[] x = new long[N];
		String second = br.readLine();
		String[] temp2 = second.split(" ");
		long[] remain = new long[M];
		long count = 0;
		x[0] = Integer.parseInt(temp2[0]) % M;
		if(x[0]==0) {
			count++;
		}
		remain[(int)x[0]]++;
		if (N >= 2) {
			for (int i = 1; i < N; i++) {
				x[i] = ((Long.parseLong(temp2[i])) % M + x[i - 1])%M;
				remain[(int)x[i]]++;
				if (x[i]%M==0) {
					count++;
				}
			}

			for (Long z : remain) {
				count += (z*(z-1)/2);
			}

		} else if (N == 1) {
			if (x[0] % M == 0) {
				count = 1;
			} else {
				count = 0;
			}
		}

		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();

	}
}