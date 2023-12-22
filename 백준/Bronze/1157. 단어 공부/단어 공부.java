import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 알파벳을 체크할 배열 check 생성.
		String word = sc.next();
		int[] check = new int[26];

		// 입력값을 알파벳단위로 쪼개 아스키코드로 변환 (A:65, Z:90, a:97, z:122)
		char[] alphabet = new char[word.length()];
		int[] ascii = new int[word.length()];

		for (int i = 0; i < word.length(); i++) {
			alphabet[i] = word.charAt(i);
			ascii[i] = (int) alphabet[i];
		}

		for (int i = 0; i < ascii.length; i++) {
			for (int j = 0; j < 26; j++) {
				if (ascii[i] - 65 == j || ascii[i] - 97 == j) {
					check[j] = check[j] + 1;
				}
			}
		}

		// 최댓값을 알아보기 위한 임시배열 temp[] 생성하고, 크기순으로 정렬
		int[] temp = new int[26];
		for (int i = 0; i < 26; i++) {
			temp[i] = check[i];
		}
		Arrays.sort(temp);

		// 가장 많이 사용된 알파벳 선택
		char result = 0;
		int max = 0;

		for (int i = 0; i < 26; i++) {
			if (check[i] == temp[25]) {
				max = i + 65;
				result = (char) max;
			}
		}

		// 출력
		if (temp[25] != temp[24]) {
			System.out.println(result);
		} else {
			System.out.println("?");
		}
	}
}