import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			String[] temp = input.split(" ");
			int[] trees = new int[N];
			for (int j = 0; j < N; j++) {
				trees[j] = Integer.parseInt(temp[j]);
			}
			Arrays.sort(trees);
			Deque<Integer> height = new LinkedList<>();
			int k =0;
			while(k!=N) {
				height.addFirst(trees[k]);
				k++;
				if(k==N) {
					break;
				}else {
					height.addLast(trees[k]);
					k++;
				}
			}
			
			int max = Math.abs(height.peekFirst()-height.peekLast());
			for(int j=0; j<N-1; j++) {
				int tempB = height.pollFirst();
				max=Math.max(max, Math.abs(tempB-height.peekFirst()));
			}
			result.append(max).append("\n");
		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}