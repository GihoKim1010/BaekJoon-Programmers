import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			ArrayList<int[]> ar = new ArrayList<>();
			for (int j = 0; j < N; j++) {
				String input = br.readLine();
				String[] temp = input.split(" ");
				int[] grade = new int[2];
				grade[0] = Integer.parseInt(temp[0]);
				grade[1] = Integer.parseInt(temp[1]);
				ar.add(grade);
			}

			Collections.sort(ar, Comparator.comparing(arr -> arr[0]));
			int count = 1;
			int x = ar.get(0)[1];
			for (int j = 1; j < N; j++) {
				if (x > ar.get(j)[1]) {
					count++;
					x=ar.get(j)[1];
				}
			}
			result.append(count).append("\n");
		}

		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}