import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int n = 0;

		while (X > n + 1) {
			n = n + 1;
			X = X - n;
		}
		if (n % 2 == 1) {
			System.out.println((X) + "/" + (n + 2 - X));
		} else {
			System.out.println((n + 2 - X) + "/" + (X));
		}
	}
}