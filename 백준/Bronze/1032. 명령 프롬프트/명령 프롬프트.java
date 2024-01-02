import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();

		String first = sc.nextLine();
		String[] char_First = new String[first.length()];
		for (int i = 0; i < first.length(); i++) {
			char temp = first.charAt(i);
			char_First[i] = String.valueOf(temp);
		}

		for (int i = 0; i < N - 1; i++) {
			String nextLine = sc.nextLine();
			for (int j = 0; j < nextLine.length(); j++) {
				char x = nextLine.charAt(j);
				if (!String.valueOf(x).equals(char_First[j])) {
					char_First[j] = "?";
				}
			}
		}
		for(String y:char_First) {
			System.out.print(y);
		}

	}
}