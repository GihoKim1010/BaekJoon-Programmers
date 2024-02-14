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

		int n = Integer.valueOf(br.readLine());
		ArrayList<int[]> lines = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			String[] sp = input.split(" ");
			int[] temp = new int[2];
			temp[0] = Integer.valueOf(sp[0]);
			temp[1] = Integer.valueOf(sp[1]);
			lines.add(temp);
		}
		long start = lines.get(0)[0], end = lines.get(0)[1], sum = 0;

		if (n == 1) {
			sum = end - start;
		} else {
			Collections.sort(lines, Comparator.<int[], Integer>comparing(ar -> ar[0]).thenComparing(ar -> ar[1]));
			start = lines.get(0)[0];
			end = lines.get(0)[1];
			for (int i = 1; i < n; i++) {

				if (end >= lines.get(i)[0] && end < lines.get(i)[1]) {
					end = lines.get(i)[1];
				} else if(end>=lines.get(i)[1]){
					continue;
				}else {
					sum += (end - start);
					start = lines.get(i)[0];
					end = lines.get(i)[1];
				}
			}
			sum+=end-start;
		}

		bw.write(String.valueOf(sum));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}