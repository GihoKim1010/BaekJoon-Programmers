import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Deque<int[]> de = new ArrayDeque<>();
		StringBuilder result = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		String[] number = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int[] temp = {i+1, Integer.parseInt(number[i])};
			de.addLast(temp);
		}


		while (true) {
			int[] tempA = de.pollFirst();
			int order = tempA[1];
			result.append(tempA[0]+" ");
			
			if(de.isEmpty()) {
				break;
			}

			if (order > 0) {
				for (int i = 0; i < order - 1; i++) {
					int[] tempB = de.pollFirst();
					de.addLast(tempB);
				}
			}else if(order<0) {
				for (int i = 0; i < (-order); i++) {
					int[] tempC = de.pollLast();
					de.addFirst(tempC);
				}
			}
		}

		bw.write(String.valueOf(result.toString()));
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}