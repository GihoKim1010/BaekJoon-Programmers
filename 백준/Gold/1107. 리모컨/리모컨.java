import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean judge(int x, ArrayList<Integer> y) {
		while (true) {
			if (y.contains(x % 10)) {
				return false;
			} else {
				x /= 10;
			}
			if (x == 0) {
				return true;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<Integer> brokenButton = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			brokenButton.add(sc.nextInt());
		}

		int min = Math.abs(N - 100);

		for (int i = 0; i <= 500000; i++) {
			int low = N - i;
			int high = N + i;

			if (judge(low, brokenButton) && low>=0) {
				String temp = String.valueOf(low);
				min = Math.min(min, N - low + temp.length());
				break;
			} else if (judge(high, brokenButton)) {
				String temp = String.valueOf(high);
				min = Math.min(min, high-N + temp.length());
				break;
			}

		}
		System.out.println(min);
	}
}