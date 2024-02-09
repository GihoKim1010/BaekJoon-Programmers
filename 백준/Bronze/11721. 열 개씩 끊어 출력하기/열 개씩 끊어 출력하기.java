import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			sb.append(String.valueOf(input.charAt(i)));
			if(i%10==9) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}