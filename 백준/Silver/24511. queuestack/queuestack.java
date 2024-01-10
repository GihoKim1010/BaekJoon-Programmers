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

		int N = Integer.parseInt(br.readLine());
		String[] secondLine = br.readLine().split(" ");
		String[] thirdLine = br.readLine().split(" ");
		int M = Integer.parseInt(br.readLine());
		String[] fifthLine = br.readLine().split(" ");
		Deque<Integer> qu = new LinkedList<>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(secondLine[i]) == 0) {
				qu.addFirst(Integer.parseInt(thirdLine[i]));
			}
		}

		for (int i = 0; i < M; i++) {
			qu.addLast(Integer.parseInt(fifthLine[i]));
			int temp = qu.pollFirst();
			result.append(temp + " ");
		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();

		br.close();
		bw.close();
	}
}