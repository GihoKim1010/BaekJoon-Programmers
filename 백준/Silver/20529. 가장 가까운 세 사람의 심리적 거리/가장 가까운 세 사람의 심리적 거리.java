import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			String input = br.readLine();

			if (n >= 33) {
				result.append(0).append("\n");
			} else {
				String[] mbti = input.split(" ");
				int min=12;
				for (int j = 0; j < n - 2; j++) {
					for (int k = j + 1; k < n - 1; k++) {
						for (int l = k + 1; l < n; l++) {
							int count = 0;
							for (int m = 0; m < 4; m++) {
								count += (mbti[j].charAt(m) == mbti[k].charAt(m)) ? 0 : 1;
								count += (mbti[k].charAt(m) == mbti[l].charAt(m)) ? 0 : 1;
								count += (mbti[l].charAt(m) == mbti[j].charAt(m)) ? 0 : 1;
							}
							min=Math.min(count, min);
						}
					}
				}
				result.append(min).append("\n");
			}
		}
		bw.write(result.toString());
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}