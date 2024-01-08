import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			String[] firstLine = br.readLine().split(" ");
			int N = Integer.parseInt(firstLine[0]);
			int M = Integer.parseInt(firstLine[1]);

			String[] secondLine = br.readLine().split(" ");
			int[] doc = new int[N];
			for (int j = 0; j < N; j++) {
				doc[j] = Integer.parseInt(secondLine[j]);
			}

			LinkedList<int[]> list = new LinkedList<>();
			for (int j = 0; j < N; j++) {
				list.offer(new int[] { j, doc[j] });
			}

			int count = 0;
			int[] priority = new int[N];

			while (list.size() != 0) {
				boolean isMax = true;
				int[] temp = list.poll();
				for (int j = 0; j < list.size(); j++) {
					if (temp[1] < list.get(j)[1]) {
						list.offer(temp);
						isMax = false;
						break;
					}
				}

				if (isMax == true) {
					count++;
					priority[temp[0]] = count;
				}

				if (priority[M] != 0) {
					result[i] = priority[M];
					break;
				}

			}

		}

		for (int x : result) {
			bw.write(String.valueOf(x)); // 배열로 수정
			bw.newLine();
		}
		bw.flush();

		br.close();
		bw.close();
	}
}