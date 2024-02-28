import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int[] number = new int[26];

		// A~Z 의 갯수를 파악.
		for (int i = 0; i < input.length(); i++) {
			number[input.charAt(i) - 'A']++;
		}

		// 홀수개인 알파벳을 하나 중앙에 배치해야하는데, 두개 이상인 경우 불가능함.
		boolean isOdd = false, judge = true;
		int odd = 26;
		for (int i = 0; i < 26; i++) {
			if (number[i] % 2 == 1) {
				if (!isOdd) {
					odd = i;
					isOdd = true;
				} else {
					judge = false;
					break;
				}
			}
		}

		if (judge) {
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < 26; i++) {
				for (int j = 0; j < number[i] / 2; j++) {
					result.append((char) (i+'A'));
				}
			}
			if(odd!=26) {
				result.append((char) (odd+'A'));
			}
			for (int i = 25; i >= 0; i--) {
				for (int j = 0; j < number[i] / 2; j++) {
					result.append((char) (i+'A'));
				}
			}
			System.out.println(result.toString());
		} else {
			System.out.println("I'm Sorry Hansoo");
		}
	}
}