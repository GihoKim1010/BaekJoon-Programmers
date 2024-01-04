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
		ArrayList<String[]> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String[] temp = br.readLine().split(" ");
			list.add(temp);
		}

		Collections.sort(list, Comparator.comparingInt(arr -> Integer.parseInt(arr[0])));

		for (String[] a : list) {
			bw.write(a[0] + " " + a[1]);
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}