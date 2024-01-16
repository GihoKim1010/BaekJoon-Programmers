public class Solution {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];

		int x = 0;
		int y = 0;
		String order = "right";

		for (int i = 1; i <= n * n; i++) {
			answer[y][x] = i;

			if (order.equals("right")) {
				if (x == n - 1 || answer[y][x + 1] != 0) {
					order = "down";
					y++;
				} else {
					x++;
				}
			} else if (order.equals("left")) {
				if (x==0 || answer[y][x-1] != 0) {
					order = "up";
					y--;
				} else {
					x--;
				}
			} else if (order.equals("up")) {
				if (y==0 || answer[y-1][x] != 0) {
					order = "right";
					x++;
				} else {
					y--;
				}
			} else if (order.equals("down")) {
				if (y == n - 1 || answer[y+1][x] != 0) {
					order = "left";
					x--;
				} else {
					y++;
				}
			}
		}
		return answer;
	}
}