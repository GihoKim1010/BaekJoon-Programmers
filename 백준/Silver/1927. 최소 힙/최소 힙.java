import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		StringBuilder result = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			int input = Integer.parseInt(br.readLine());
			
			if(input==0) {
				if(minHeap.isEmpty()) {
					result.append(0).append("\n");
				}else {
					result.append(minHeap.poll()).append("\n");
				}
			}else {
				minHeap.add(input);
			}
		}
		
		bw.write(String.valueOf(result.toString()));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();

	}
}