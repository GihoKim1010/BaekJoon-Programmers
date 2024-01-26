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
		ArrayList<int[]> room = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			int[] x = new int[2];
			x[0] = Integer.parseInt(temp[0]);
			x[1] = Integer.parseInt(temp[1]);
			room.add(x);
		}

		Collections.sort(room, Comparator.<int[], Integer>comparing(arr -> arr[1]).thenComparing(arr -> arr[0]));

		int end = 0;
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if(end <=room.get(i)[0]) {
				end=room.get(i)[1];
				count++;
			}
		}

		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();

	}
}