import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m=sc.nextInt();
		int[][] relation = new int[n+1][n+1];
		int max = n+1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) {
					relation[i][j]=0;
				}else {
					relation[i][j]=max;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt(), b=sc.nextInt();
			relation[a][b]=relation[b][a]=1;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					relation[j][k]=Math.min(relation[j][k], relation[j][i]+relation[i][k]);
				}
			}
		}
		
		int min =Integer.MAX_VALUE;
		int index =0;
		for(int i=1; i<=n; i++) {
			int sum = 0;
			for(int j=1; j<=n; j++) {
				sum+=relation[i][j];
			}
			
			if(min>sum) {
				index=i;
				min=sum;
			}
		}
		System.out.println(index);
	}
}