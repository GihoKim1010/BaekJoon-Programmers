import java.util.Scanner;

public class Main {

	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();

		arr = new int[m];
		dfs(n, m, 0);
		System.out.println(sb.toString());
	}

	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int x : arr) {
				sb.append(x).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			dfs(n, m, depth + 1);
		}
	}
}