import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static int[][] board;
	public static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			board = new int[n][n];
			int startY = sc.nextInt(), startX = sc.nextInt();
			int endY = sc.nextInt(), endX = sc.nextInt();
			
			bfs(startY, startX, endY, endX);
			
			result.append(board[endY][endX]-1).append("\n");
			
		}
		System.out.println(result.toString());

	}
	
	public static void bfs(int startY, int startX, int endY, int endX) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] {startY, startX});
		board[startY][startX]=1;
		
		int[][] directions = {{-1, -2}, {-2,-1}, {-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}};
		
		while(!qu.isEmpty()) {
			int[] temp = qu.poll();
			int nowY = temp[0], nowX = temp[1];
			
			for(int[] dir : directions) {
				int newY=nowY+dir[0], newX=nowX+dir[1];
				if(newY<n && newX<n && newY>=0 && newX>=0 && board[newY][newX]==0) {
					board[newY][newX]=board[nowY][nowX]+1;
					qu.add(new int[] {newY,newX});
					
					if(newY==endY && newX==endX) {
						return;
					}
				}
			}
		}
	}
}