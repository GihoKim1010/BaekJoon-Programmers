import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int result = 0;
		int x = 0;

		for (int i = 0; i < input.length() - 1; i++) {
			char temp = input.charAt(i);
			if (temp == '(') {
				x++;
				if (input.charAt(i + 1) == '(') {
					result++;
				}
			} else {
				x--;
				if (input.charAt(i - 1) == '(') {
					result += x;
				}
			}
		}
		System.out.println(result);
	}
}