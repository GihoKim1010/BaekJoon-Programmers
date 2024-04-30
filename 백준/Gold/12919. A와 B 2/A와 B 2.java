import java.util.Scanner;

public class Main {

	private static int sLen;
	private static int result;
	private static String S;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		S = sc.nextLine();
		String T = sc.nextLine();
		sLen = S.length();
		dfs(T);
		result = (result > 1) ? 1 : result;
		System.out.println(result);
	}

	private static void dfs(String T) {
		if (sLen >= T.length()) {
			if (T.equals(S)) {
				result += 1;
				return;
			} else {
				return;
			}
		}

		if (T.charAt(0) == 'B') {
			StringBuilder temp = new StringBuilder(T);
			temp.deleteCharAt(0);
			temp.reverse();
			dfs(temp.toString());
		}

		if (T.charAt(T.length() - 1) == 'A') {
			StringBuilder temp = new StringBuilder(T);
			temp.deleteCharAt(temp.length() - 1);
			dfs(temp.toString());
		}
	}
}