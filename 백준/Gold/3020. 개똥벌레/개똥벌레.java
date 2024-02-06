import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String firstLine = br.readLine();
		String[] temp = firstLine.split(" ");
		int n = Integer.parseInt(temp[0]);
		int h = Integer.parseInt(temp[1]);
		int[] ground = new int[h+1];
		int[] ceiling = new int[h+1];

		for (int i = 0; i < n; i++) {
			int obs = Integer.parseInt(br.readLine());
			if (i % 2 == 0) {
				ground[obs]++;
			} else {
				ceiling[obs]++;
			}
		}
		

		for (int i = h - 1; i > 0; i--) {
			ground[i] += ground[i + 1];
			ceiling[i] += ceiling[i + 1];
		}

		int count = 1;
		int[] cave=new int[h];
		
		for (int i = 0; i < h; i++) {
			cave[i]=ground[i+1]+ceiling[h-i];
		}

		Arrays.sort(cave);

		for (int i = 1; i < h; i++) {
			if (cave[i] == cave[0]) {
				count++;
			} else {
				break;
			}
		}
		bw.write(String.valueOf(cave[0] + " " + count));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}