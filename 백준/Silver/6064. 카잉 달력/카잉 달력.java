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
			String[] input = br.readLine().split(" ");
			int M = Integer.parseInt(input[0]);
			int N = Integer.parseInt(input[1]);
			int x = Integer.parseInt(input[2]);
			int y = Integer.parseInt(input[3]);

			if (x == y) {
				result[i] = x;
			} else if(M<=N){
				int n=x;
				int m=x;
				for (int j = 1; j <= N; j++) {
					n +=M;
					m = n%N;
					if(m==0) {
						m=N;
					}
					
					if(m==y) {
						result[i]=x+(j*M);
						break;
					}else if(m==x) {
						result[i]=-1;
						break;
					}
				}
			}else {
				int n=y;
				int m=y;
				for (int j = 1; j <= M; j++) {
					n +=N;
					m = n%M;
					if(m==0) {
						m=M;
					}
					
					if(m==x) {
						result[i]=y+(j*N);
						break;
					}else if(m==y) {
						result[i]=-1;
						break;
					}
				}
			}
		}

		for (int z : result) {
			bw.write(String.valueOf(z));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
}