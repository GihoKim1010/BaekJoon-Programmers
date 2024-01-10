import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<Integer> de = new LinkedList<>();
		StringBuilder result = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i =0; i<N; i++) {
			String[] input = br.readLine().split(" ");
			int order = Integer.parseInt(input[0]);
			
			switch(order) {
			
			case 1:
				de.addFirst(Integer.parseInt(input[1]));
				break;
			case 2:
				de.addLast(Integer.parseInt(input[1]));
				break;
			case 3:
				result.append(de.isEmpty()? -1:de.pollFirst()).append("\n");
				break;
			case 4:
				result.append(de.isEmpty()? -1:de.pollLast()).append("\n");
				break;
			case 5:
				result.append(de.size()).append("\n");
				break;
			case 6:
				result.append(de.isEmpty()? 1:0).append("\n");
				break;
			case 7:
				result.append(de.isEmpty()? -1:de.peekFirst()).append("\n");
				break;
			case 8:
				result.append(de.isEmpty()? -1:de.peekLast()).append("\n");
				break;
			}
			
			
		}
		
		bw.write(String.valueOf(result.toString()));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}