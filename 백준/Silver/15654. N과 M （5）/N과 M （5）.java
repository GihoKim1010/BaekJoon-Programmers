import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static boolean[] visit;
	public static int[] partAr;
	public static int[] originAr;
	public static StringBuilder result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		visit = new boolean[n];
		partAr = new int[m];
		originAr = new int[n];
		result = new StringBuilder();
		
		
		for(int i=0; i<n; i++) {
			originAr[i]=sc.nextInt();
		}
		
		Arrays.sort(originAr);
		dfs(0,n,m);
		System.out.println(result.toString());

	}

	public static void dfs(int depth, int n, int m) {

		if (depth == m) {
			for(int x:partAr) {
				result.append(x+" ");
			}
			result.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				partAr[depth]=originAr[i];
				dfs(depth+1, n, m);
				visit[i]=false;
			}
		}
	}
}