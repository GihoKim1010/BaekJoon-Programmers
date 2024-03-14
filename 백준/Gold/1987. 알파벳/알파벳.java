import java.util.Scanner;

public class Main {

	public static int r,c,maxCount;
	public static char[][] board;
	public static boolean[] visit;
	public static int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c=sc.nextInt();
		sc.nextLine();
		board=new char[r][c];
		visit=new boolean[26];
		
		for(int i=0; i<r; i++) {
			String input = sc.nextLine();
			for (int j=0; j<c; j++) {
				board[i][j]=input.charAt(j);
			}
		}
		
		visit[board[0][0]-'A']=true;
		dfs(0,0,1);
		
		System.out.println(maxCount);
		
	}
	
	public static void dfs(int y, int x, int count) {
		maxCount = Math.max(maxCount, count);
		
		for(int[] dir:directions) {
			int newY=y+dir[0], newX=x+dir[1];
			
			if(newY>=0 && newY<r && newX>=0 && newX<c && !visit[board[newY][newX]-'A']) {
				visit[board[newY][newX]-'A']=true;
				dfs(newY,newX,count+1);
				visit[board[newY][newX]-'A']=false;
			}
		}
		
	}
}