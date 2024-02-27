import java.util.Scanner;

public class Main {

	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static boolean[] visit;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();

		// 방문 여부 저장할 boolean 배열과 값을 저장할 int배열.
		visit = new boolean[n];
		arr = new int[m];
		dfs(n,m,0);
		System.out.println(sb.toString());
	}

	public static void dfs(int n, int m, int depth) {
		if(depth==m) {
			for(int x : arr) {
				sb.append(x).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 0 ; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr[depth]=i+1;
				dfs(n,m,depth+1);
				visit[i]=false;
			}
		}
	}
}