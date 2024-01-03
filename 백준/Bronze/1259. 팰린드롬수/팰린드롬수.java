import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> result = new ArrayList<>();

		while (true) {
			int x = sc.nextInt();

			if (x == 0) {
				break;
			}

			String temp = String.valueOf(x);
			int[] a = new int[temp.length()];

			for (int i = 0; i < temp.length(); i++) {
				char y = temp.charAt(i);
				a[i] = y - '0';
			}

			String judge = "yes";
			if (temp.length() % 2 == 1) {
				for (int i = 0; i < (temp.length() - 1) / 2; i++) {
					if (a[i] != a[temp.length() - 1 - i]) {
						judge = "no";
					}
				}
			} else if (temp.length() % 2 == 0) {
				for (int i = 0; i < (temp.length()) / 2; i++) {
					if (a[i] != a[temp.length() - 1 - i]) {
						judge = "no";
					}
				}

			}
			result.add(judge);
		}
		for (String z : result) {
			System.out.println(z);
		}
	}
}