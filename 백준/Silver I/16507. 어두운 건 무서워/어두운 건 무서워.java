import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt(), c = sc.nextInt(), q = sc.nextInt();
		int[][] photo = new int[r + 1][c + 1];

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				photo[i][j] = sc.nextInt() + photo[i - 1][j] + photo[i][j - 1] - photo[i - 1][j - 1];
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int r1 = sc.nextInt(), c1 = sc.nextInt(), r2 = sc.nextInt(), c2 = sc.nextInt();
			int size = (r2 - r1 + 1) * (c2 - c1 + 1);
			int sum =photo[r2][c2]-photo[r2][c1-1]-photo[r1-1][c2]+photo[r1-1][c1-1];
			result.append((sum / size) + "\n");
		}
		System.out.println(result.toString());
	}
}