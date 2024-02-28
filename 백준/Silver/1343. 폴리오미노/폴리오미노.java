import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.replaceAll("XXXX", "AAAA");
		input = input.replaceAll("XX", "BB");
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'X') {
				System.out.println(-1);
				break;
			}else if (i==input.length()-1 && input.charAt(input.length()-1)!='X') {
				System.out.println(input);
			}
		}
	}
}