import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int n, m, count;
	public static boolean[][] paper;
	public static PriorityQueue<Integer> result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		int k = sc.nextInt();
		paper = new boolean[m][n];
		result= new PriorityQueue<>();
		
		for(int i=0; i<k; i++) {
			int x1=sc.nextInt(), y1=sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt();
			
			for(int j=y1; j<y2; j++) {
				for(int l=x1; l<x2; l++) {
					paper[j][l]=true;
				}
			}
		}
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(!paper[i][j]) {
					bfs(i,j);
					result.add(count);
				}
			}
		}
		System.out.println(result.size());
		
		while(!result.isEmpty()) {
			System.out.print(result.poll()+" ");
		}
	}

	public static void bfs(int y, int x) {
		Queue<int[]> qu = new LinkedList<>();
		qu.add(new int[] {y,x});
		count=1;
		paper[y][x]=true;
		
		int[][] directions = {{-1,0}, {1,0}, {0,-1}, {0,1}};
		
		while(!qu.isEmpty()) {
			int[] temp = qu.poll();
			
			for(int[] dir : directions) {
				int newY=temp[0]+dir[0], newX = temp[1]+dir[1];
				
				if(newY>=0 && newY<m && newX>=0 && newX<n && !paper[newY][newX]) {
					qu.add(new int[] {newY, newX});
					paper[newY][newX]=true;
					count++;
				}
			}
		}
	}
}