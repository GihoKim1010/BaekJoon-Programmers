import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), m=sc.nextInt();
		int[][] temp = new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				temp[i][j]=sc.nextInt()+temp[i][j-1]+temp[i-1][j]-temp[i-1][j-1];
			}
		}
		
		int k=sc.nextInt();
		StringBuilder result = new StringBuilder();
		for(int a=0; a<k; a++) {
			int i=sc.nextInt(), j=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
			result.append(temp[x][y]-temp[x][j-1]-temp[i-1][y]+temp[i-1][j-1]).append("\n");
		}
		
		System.out.println(result.toString());
	}
}