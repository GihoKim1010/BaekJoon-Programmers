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

		int N = Integer.parseInt(br.readLine());
		ArrayList<int[]> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			int[] temp2 = new int[2];
			temp2[0] = Integer.parseInt(temp[0]);
			temp2[1] = Integer.parseInt(temp[1]);
			list.add(temp2);
		}

		Collections.sort(list, Comparator.<int[], Integer>comparing(arr -> arr[0]).thenComparing(arr -> arr[1]));

		for (int[] x : list) {
			bw.write(x[0] + " " + x[1]);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}