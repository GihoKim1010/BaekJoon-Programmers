import java.util.Scanner;

public class Main {

	public static double slope(int x1, int y1, int x2, int y2) {
		double answer = (double) 1.0*(y2 - y1) / (x2 - x1);
		return answer;
	}

	public static boolean judge(int x0, int y0, int x1, int y1, int x2, int y2) {
		double slope1 = slope(x0, y0, x1, y1);
		double slope2 = slope(x0, y0, x2, y2);
		return slope1 < slope2;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int N = sc.nextInt();
		int[] building = new int[N];

		for (int i = 0; i < N; i++) {
			building[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			int temp = 0;
			int max_i = 0;
			int max_height = 0;

			int x = 0;
			if (i - 1 >= 0) {
				temp++;
				max_i = i - 1;
				max_height = building[i - 1];
			}

			while (i - x - 1 > 0) {
				x++;
				if (judge(i, building[i], i - 1 - x, building[i - x - 1], max_i, max_height)) {
					temp++;
					max_i = i - x - 1;
					max_height = building[i - x - 1];
				}
			}

			x = 0;
			max_i = 0;
			max_height = 0;

			if (i + 1 < N) {
				temp++;
				max_i = i + 1;
				max_height = building[i + 1];
			}

			while (i + x + 1 < N - 1) {
				x++;
				if (judge(i, building[i], max_i, max_height, i + x + 1, building[i + x + 1])) {
					temp++;
					max_i = i + x + 1;
					max_height = building[i + x + 1];
				}
			}

			answer = Math.max(temp, answer);
		}
		System.out.println(answer);
	}
}