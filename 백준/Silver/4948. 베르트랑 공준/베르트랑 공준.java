import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> result = new ArrayList<>();

		while (true) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			} else {
				boolean[] x = new boolean[2*n + 1];
				x[0] = x[1] = true;

				for (int i = 2; i * i <= 2 * n; i++) {
					if (!x[i]) {
						for (int j = i * i; j <= 2 * n; j += i) {
							x[j] = true;
						}
					}
				}
				int count = 0;
				for (int i = n + 1; i <= 2 * n; i++) {
					if (!x[i]) {
						count++;
					}
				}
				result.add(count);
			}

		}
		for (int x : result) {
			System.out.println(x);
		}
	}
}