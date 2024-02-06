import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String input = sc.nextLine();
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (input.charAt(j) == 'F' && j % 2 == 0) {
						count++;
					}
				} else {
					if (input.charAt(j) == 'F' && j % 2 == 1) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}