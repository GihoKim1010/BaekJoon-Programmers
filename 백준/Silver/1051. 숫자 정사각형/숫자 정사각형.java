import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		int[][] box = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String input = sc.nextLine();
			for(int j=0; j<m; j++) {
				box[i][j]=input.charAt(j)-'0';
			}
		}
		int answer =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				int x = box[i][j];
				for(int k=0; k+j<m; k++) {
					if(i+k<n && box[i][k+j]==x && box[i+k][k+j]==x && box[i+k][j]==x) {
						answer=Math.max(answer, (k+1)*(k+1));
					}
				}
			}
		}
		System.out.println(answer);
	}
}