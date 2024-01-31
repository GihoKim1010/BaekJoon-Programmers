import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	
	public static long stock(int[] x, int start) {
		if(start==x.length-1) {
			return 0;
		}else {
			int max = -1;
			int when = -1;
			for(int i =start+1; i<x.length; i++) {
				if(max<=x[i]) {
					when=i;
					max=x[i];
				}
			}
			long sum = 0;
			for(int i=start+1; i<when; i++) {
				sum+=(long)(max-x[i]);
			}
			start=when;
			return sum+stock(x, start);
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String[] temp = input.split(" ");
			int[] days = new int[N];
			for (int j = 0; j < N; j++) {
				days[j] = Integer.parseInt(temp[j]);
			}
			result.append(stock(days,-1)).append("\n");

		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}