import java.util.Scanner;

public class Main {

	public static String isPPAP(String input) {

		String answer = "PPAP";
		int countP = 0;
		if (input.charAt(input.length() - 1) == 'A') {
			answer = "NP";
		} else {
			for (int i = 0; i < input.length() - 1; i++) {
				if (String.valueOf(input.charAt(i)).equals("P")) {
					countP++;
				} else {
					if (countP >= 2 && String.valueOf(input.charAt(i + 1)).equals("P")) {
						countP -= 2;
					} else {
						answer = "NP";
						break;
					}
				}
			}
			if(countP!=0) {
				answer="NP";
			}
		}
		return answer;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		System.out.println(isPPAP(input));
	}
}