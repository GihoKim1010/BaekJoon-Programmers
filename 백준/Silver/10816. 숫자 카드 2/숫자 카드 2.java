import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		int N = Integer.parseInt(br.readLine());
		int[] card = new int[N];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
				card[i] = Integer.parseInt(temp[i]);
			}
		
		HashMap<Integer, Integer> result = new HashMap<>(N);
		for(int i=0; i<N; i++) {
			result.put(card[i], result.getOrDefault(card[i], 0)+1);
		}
		
		int M = Integer.parseInt(br.readLine());
		int[] num = new int[M];
		String[] temp2 = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
				num[i] = Integer.parseInt(temp2[i]);
		}
		
		for(int i=0; i<num.length; i++) {
			bw.write(String.valueOf(result.getOrDefault(num[i],0))+" ");
		}
		
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}