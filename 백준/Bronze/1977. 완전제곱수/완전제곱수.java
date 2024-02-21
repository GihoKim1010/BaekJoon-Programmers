import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(), n = sc.nextInt();

		int sum = 0, min = 0;

		for (int i = 100; i >= 1; i--) {
			if (i * i <= n && i * i >= m) {
				min = i * i;
				sum += (i * i);
			}
		}

		if (min != 0) {
			System.out.println(sum + "\n" + min);
		}else {
			System.out.println(-1);
		}
	}
}