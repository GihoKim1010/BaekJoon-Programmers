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
		String[] tempA = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] tempB = br.readLine().split(" ");
		int[] result = new int[M];
		HashMap<Integer, Integer> hs = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			int A=Integer.parseInt(tempA[i]);
			hs.put(A, 1);
		}
		for(int i=0; i<M; i++) {
			int B = Integer.parseInt(tempB[i]);
			if(hs.containsKey(B)) {
				result[i]=1;
			}else {
				result[i]=0;
			}
		}
		
		for (int x : result) {
			bw.write(String.valueOf(x+" "));
		}
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}