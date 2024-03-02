import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());

		StringBuilder result = new StringBuilder();
		boolean judge = true;

		if (x < n) {
			judge = false;
		} else if ((x / 26) > n) {
			judge = false;
		} else if (x / 26 == n && x % 26 != 0) {
			judge = false;
		}

		if (judge) {
			char[] now = new char[n];
			x -= n;
			for (int i = n - 1; i >= 0; i--) {
				now[i] = 'A';

				if (x >= 25) {
					x -= 25;
					now[i] += 25;
				}
				
				else if (x > 0 && x < 25) {
					now[i] += x;
					x = 0;
				}
				result.append(now[i]);
			}
			result.reverse(); // 배열 뒤집기
			System.out.println(result);
		} else {
			System.out.println("!");
		}
	}
}