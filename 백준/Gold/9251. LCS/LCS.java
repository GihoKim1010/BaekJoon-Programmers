import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	private static char[] char1;
	private static char[] char2;
	private static Integer[][] dp;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char1 = br.readLine().toCharArray();
		char2 = br.readLine().toCharArray();
		dp = new Integer[char1.length][char2.length];

		bw.write(String.valueOf(LCS(char1.length - 1, char2.length - 1)));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}

	private static int LCS(int y, int x) {
		if (y < 0 || x < 0) {
			return 0;
		}
		if (dp[y][x] == null) {
			dp[y][x]=0;
			if (char1[y] == char2[x]) {
				dp[y][x] = LCS(y - 1, x - 1) + 1;
			} else {
				dp[y][x] = Math.max(LCS(y - 1, x), LCS(y, x - 1));
			}
		}
		return dp[y][x];
	}
}