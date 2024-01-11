import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int result = 0;
		int count = 0;
		int i = 0;

		while (i + 2 < M) {
			char temp = S.charAt(i);
			if (temp == 'I') {
				while (i+2<M) {
					if (S.charAt(i + 1) == 'O' && S.charAt(i + 2) == 'I') {
						count++;
						i += 2;
					}else {
						i++;
						break;
					}
				}
			}else {
				i++;
			}

			if (count >= N) {
				result += count-N+1;
				count=0;
			}else {
				count=0;
			}
		}

		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}