import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static StringBuilder result;
	public static int[] answer, ar;
	public static int n,m;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		ar = new int[n];
		result = new StringBuilder();
		answer = new int[m];

		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		print(0,0);
		System.out.println(result.toString());
	}

	public static void print(int start, int depth) {
		if(depth==m) {
			for(int x : answer) {
				result.append(x+" ");
			}
			result.append("\n");
			return;
		}
		
		for(int i=start; i<n; i++) {
			answer[depth]=ar[i];
			print(i,depth+1);
		}
	}
}