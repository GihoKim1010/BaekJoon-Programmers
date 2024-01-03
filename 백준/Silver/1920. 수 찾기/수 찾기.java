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
		int[] A = new int[N];

		String temp = br.readLine();
		String[] x = temp.split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(x[i]);
		}
		Arrays.sort(A);

		int M = Integer.parseInt(br.readLine());
		int[] B = new int[M];

		String temp2 = br.readLine();
		String[] y = temp2.split(" ");
		for (int i = 0; i < M; i++) {
			B[i] = Integer.parseInt(y[i]);
		}

		int[] result = new int[M];
		for(int i=0; i<M; i++) {
			int a= Arrays.binarySearch(A, B[i]);
			
			if(a>=0) {
				result[i]=1;
			}else {
				result[i]=0;
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
