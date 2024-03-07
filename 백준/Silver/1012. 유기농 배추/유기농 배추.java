import java.util.Scanner;

public class Main {
	
	public static int[][] ground;
	
	public static void findOne(int a, int b, int n, int m) {
		
		ground[a][b]=0;
		
		if(a-1>=0 && ground[a-1][b]==1) {
			findOne(a-1,b,n,m);
		}
		
		if(b-1>=0 && ground[a][b-1]==1) {
			findOne(a,b-1,n,m);
		}
		
		if(a+1<n && ground[a+1][b]==1) {
			findOne(a+1,b,n,m);
		}
		
		if(b+1<m && ground[a][b+1]==1) {
			findOne(a,b+1,n,m);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i =0; i<t; i++) {
			int m = sc.nextInt(), n=sc.nextInt(), k=sc.nextInt();
			ground = new int[n][m];
			
			for(int j=0; j<k; j++) {
				int x = sc.nextInt(), y=sc.nextInt();
				ground[y][x]=1;
			}
			
			int count=0;
			
			for(int a=0; a<n; a++) {
				for(int b=0; b<m; b++) {
					if(ground[a][b]==1) {
						count++;
						findOne(a,b,n,m);
					}
				}
			}
			
			result.append(count).append("\n");
		}
		
		System.out.println(result.toString());
	}
}