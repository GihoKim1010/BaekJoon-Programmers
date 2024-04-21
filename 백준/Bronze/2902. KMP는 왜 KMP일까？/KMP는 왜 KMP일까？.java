import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder result = new StringBuilder();
		String[] names = input.split("-");

		for (int i = 0; i < names.length; i++) {
			result.append(String.valueOf(names[i].charAt(0)));
		}

		System.out.println(result.toString());
	}
}