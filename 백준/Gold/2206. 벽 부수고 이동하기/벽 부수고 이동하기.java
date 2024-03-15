import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class path{
		int y;
		int x;
		int count;
		boolean destroy;
		
		public path(int y, int x, int count, boolean destroy) {
			this.y=y;
			this.x=x;
			this.count=count;
			this.destroy=destroy;
		}
	}

	static char[][] map;
	static int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	static int n, m;
	static boolean end = false;
	static boolean[][][] visit;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		map = new char[n][m];
		
		//index 2 에 부순 횟수 저장.
		visit = new boolean[n][m][2];

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = (char)(input.charAt(j));
			}
		}

		bfs();
	}
	
	
	static void bfs() {
		Queue<path> qu = new LinkedList<>();
		qu.add(new path(0,0,1,false));
		
		while(!qu.isEmpty()) {
			path now = qu.poll();
			
			if(now.y==n-1 && now.x ==m-1) {
				System.out.println(now.count);
				return;
			}
			
			for(int[] dir : directions) {
				int newY=now.y+dir[0], newX =now.x+dir[1];
				
				if(newY<0 || newY>=n || newX<0 || newX>=m) {
					continue;
				}
				
				if(map[newY][newX]=='0') {
					if(!now.destroy && !visit[newY][newX][0]) {
						qu.add(new path(newY, newX, now.count+1, false));
						visit[newY][newX][0]=true;
					}else if(now.destroy && !visit[newY][newX][1]) {
						qu.add(new path(newY, newX, now.count+1, true));
						visit[newY][newX][1]=true;
					}
				}else {
					if(!now.destroy) {
						qu.add(new path(newY, newX, now.count+1, true));
						visit[newY][newX][1]=true;
					}
				}
			}
		}
		System.out.println(-1);
	}
}