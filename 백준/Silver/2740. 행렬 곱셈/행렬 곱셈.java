import java.util.Scanner;

public class Main {

	public static int multiply(int[][] a, int[][] b, int i, int j, int m) {

		int answer=0;
		
		for(int l=0; l<m; l++) {
			answer+= a[i][l]*b[l][j];
		}
		
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] a = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int l = sc.nextInt(), k = sc.nextInt();
		int[][] b = new int[l][k];

		for (int i = 0; i < l; i++) {
			for (int j = 0; j < k; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		int[][] result = new int[n][k];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				result[i][j]=multiply(a,b,i,j,m);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(result[i][j]+ " ");
			}
			System.out.println();
		}
	}
}