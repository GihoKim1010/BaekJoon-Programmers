import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static boolean[][] map;
	public static ArrayList<Integer> result;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		map = new boolean[n][n];
		result=new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < n; j++) {
				if (input.charAt(j) == '1') {
					map[i][j] = true;
				}
			}
		}
		bfs(n);
		Collections.sort(result);
		System.out.println(result.size());
		
		for(int x : result) {
			System.out.println(x);
		}
	}

	public static void bfs(int n) {

		Queue<int[]> qu = new LinkedList<>();
		int[][] directions = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j]) {
					int count = 1;
					map[i][j] = false;
					qu.add(new int[] { i, j });

					while (!qu.isEmpty()) {
						int[] temp =qu.poll();
						int y = temp[0];
						int x = temp[1];
						
						for (int[] dir : directions) {
							int newY = y + dir[0];
							int newX = x + dir[1];
							
							if(newY>=0 && newY<n && newX>=0 && newX<n && map[newY][newX]) {
								count++;
								map[newY][newX]=false;
								qu.add(new int[] {newY, newX});
							}
						}
					}
					
					result.add(count);
				}
			}
		}
	}
}