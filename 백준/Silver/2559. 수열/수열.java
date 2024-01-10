import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static void star(int n) {
		
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] firstLine = br.readLine().split(" ");
		int N=Integer.parseInt(firstLine[0]);
		int K=Integer.parseInt(firstLine[1]);
		
		String[] secondLine = br.readLine().split(" ");
		int[] sum = new int[N];
		sum[0]=Integer.parseInt(secondLine[0]);
		for(int i=1; i<N; i++) {
			sum[i]=sum[i-1]+Integer.parseInt(secondLine[i]);
		}
		
		int max=sum[K-1];
				
		for(int i=0; i<N-K; i++) {
			int a=sum[i];
			int b=sum[i+K];
			int temp = b-a;
			
			max=Math.max(max, temp);
		}
		
		bw.write(String.valueOf(max));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}