import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int M = Integer.valueOf(br.readLine());
		HashSet<Integer> hs = new HashSet<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");

			if (temp[0].equals("add")) {
				int x = Integer.valueOf(temp[1]);
				hs.add(x);
			} else if (temp[0].equals("remove")) {
				int x = Integer.valueOf(temp[1]);
				hs.remove(x);
			} else if (temp[0].equals("check")) {
				int x = Integer.valueOf(temp[1]);
				if (hs.contains(x)) {
					result.add("1");
				} else {
					result.add("0");
				}
			} else if (temp[0].equals("toggle")) {
				int x = Integer.valueOf(temp[1]);
				if (hs.contains(x)) {
					hs.remove(x);
				} else {
					hs.add(x);
				}
			} else if (temp[0].equals("all")) {
				hs.clear();
				for (int j = 1; j <= 20; j++) {
					hs.add(j);
				}
			} else if (temp[0].equals("empty")) {
				hs.clear();
			}
		}

		for (String y : result) {
			bw.write(String.valueOf(y));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}