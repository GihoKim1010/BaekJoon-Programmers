import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> x = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();

		for (int i = 0; i < N; i++) {
			String command = br.readLine();
			String[] temp = command.split(" ");

			if (temp.length == 2) {
				x.offer(Integer.parseInt(temp[1]));
			} else if (command.equals("pop")) {
				if (x.size() == 0) {
					result.offer(-1);
				} else {
					int a = x.poll();
					result.offer(a);
				}
			} else if (command.equals("size")) {
				result.offer(x.size());
			} else if (command.equals("empty")) {
				if (x.size() == 0) {
					result.offer(1);
				} else {
					result.offer(0);
				}
			} else if (command.equals("front")) {
				if (x.size() == 0) {
					result.offer(-1);
				} else {
					int b = x.poll();
					result.offer(b);
					x.offer(b);
					for (int j = 0; j < x.size() - 1; j++) {
						int c = x.poll();
						x.offer(c);
					}
				}
			} else if (command.equals("back")) {
				if (x.size() == 0) {
					result.offer(-1);
				} else {
					for (int j = 0; j < x.size() - 1; j++) {
						int d = x.poll();
						x.offer(d);
					}
					int e = x.poll();
					result.offer(e);
					x.offer(e);
				}
			}
		}

		for (int z : result) {
			bw.write(String.valueOf(z));
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}