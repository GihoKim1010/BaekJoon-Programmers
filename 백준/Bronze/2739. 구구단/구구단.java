import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		while (true) {
			for (int i = 1; i < 10; i++) {
				System.out.println(a+" * "+i+" = "+(a*i));
				if (i == 9) {
					break;
				}
			}
			break;
		}
	}
}