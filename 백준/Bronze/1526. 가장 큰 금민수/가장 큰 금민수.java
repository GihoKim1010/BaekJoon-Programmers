import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int answer =0;
		for(int i =n; i>=4; i--) {
			String number = String.valueOf(i);
			number=number.replaceAll("7", "");
			number=number.replaceAll("4", "");
			if (number.isBlank()) {
				answer=i;
				break;
			}
		}
		System.out.println(answer);
	}
}