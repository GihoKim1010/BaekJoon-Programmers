import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static int[][] lab;
	public static int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int n, m, maxSafeCount;
	public static Queue<int[]> virus;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		maxSafeCount=0;
		lab = new int[n][m];
		virus=new LinkedList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				lab[i][j] = sc.nextInt();
				if (lab[i][j] == 2) {
					virus.add(new int[] { i, j });
				}
			}
		}
		
		makeWallDfs(0);
		
		System.out.println(maxSafeCount);
	}

	public static void makeWallDfs(int depth) {

		if (depth == 3) {
			virusBfs();
			return; 
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (lab[i][j] == 0) {
					lab[i][j] = 1;
					makeWallDfs(depth + 1);
					lab[i][j] = 0;
				}
			}
		}
	}

	public static void virusBfs() {
		int copyLab[][] = copy(lab);
		Queue<int[]> copyVirus = new LinkedList<>(virus);
		
		while (!copyVirus.isEmpty()) {
			int[] now = copyVirus.poll();
			int y = now[0], x = now[1];

			for (int[] dir : directions) {
				int newY = y + dir[0], newX = x + dir[1];
				
				if(newY>=0 && newY<n && newX>=0 && newX<m && copyLab[newY][newX]==0) {
					copyVirus.add(new int[] {newY,newX});
					copyLab[newY][newX]=2;
				}
			}
		}
		countSafeZone(copyLab);
	}
	
	public static void countSafeZone(int[][] copyLab) {
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(copyLab[i][j]==0) {
					count++;
				}
			}
		}
		maxSafeCount=Math.max(count, maxSafeCount);
	}
	
	public static int[][] copy(int[][] lab){
		int[][] temp = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				temp[i][j]=lab[i][j];
			}
		}
		return temp;
	}
}