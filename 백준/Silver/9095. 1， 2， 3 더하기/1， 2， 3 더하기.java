import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.valueOf(br.readLine());
		int[] result = new int[T];
		for (int j = 0; j < T; j++) {
			int n = Integer.valueOf(br.readLine());
			int[] calc = new int[n+1];

			if(n==1) {
				result[j]=1;
			}else if(n==2){
				result[j]=2;
			}else if(n==2){
				result[j]=4;
			}else {
				calc[1] = 1;
				calc[2] = 2;
				calc[3] = 4;
				for (int i = 4; i <= n; i++) {
					calc[i] = calc[i - 1] + calc[i - 2] + calc[i - 3];
				}
				result[j] = calc[n];
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