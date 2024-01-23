import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder answer = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			br.readLine();
			String[] x = br.readLine().split(" ");
			long[] y = new long[3];
			
			for(int j =0; j<3; j++) {
				y[j]=Long.parseLong(x[j]);
			}
			Arrays.sort(y);
			long A=y[2];
			long B=y[1];
			long C=y[0];
			long D = Long.parseLong(x[3]);
			
			if(A-B>=D) {
				A-=D;
			}else {
				D-=(A-B);
				A=B;
				if(2*(B-C)>=D) {
					if(D%2==0) {
						A-=(D/2);
						B-=(D/2);
					}else {
						A-=(D/2+1);
						B-=(D/2);
					}
				}else {
					D-=2*(B-C);
					A=C;
					B=C;
					if(D%3==0) {
						A-=D/3;
						B-=D/3;
						C-=D/3;
					}else if(D%3==1) {
						A-=(D/3+1);
						B-=D/3;
						C-=D/3;
					}else {
						A-=(D/3+1);
						B-=(D/3+1);
						C-=D/3;
					}
				}
			}


			BigInteger result = BigInteger.ONE;
			result = result.multiply(BigInteger.valueOf(A));
			result = result.multiply(BigInteger.valueOf(B));
			result = result.multiply(BigInteger.valueOf(C));

			answer.append(result).append("\n");
		}

		bw.write(answer.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}