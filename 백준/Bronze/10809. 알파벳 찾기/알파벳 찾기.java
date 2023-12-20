import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 단어 S 입력받음
		String S = sc.next();

		// 출력에 사용할 배열 생성. 크기는 알파벳 갯수만큼. 편의를 위해 값을 전부 -1로 지정.
		int[] x = new int[26];
		for (int i = 0; i < 26; i++) {
			x[i] = (-1);
		}

		// 단어를 문자단위로 분리하여 얻은 a 를 유니코드값 b로 변환.
		for (int i = 0; i < S.length(); i++) {
			char a = S.charAt(i);
			int b = (int) a;

			// 각 알파벳의 등장 위치를 고려하여 출력할 숫자들을 구함. (a=97부터 시작됨.)
			for (int j = 0; j < 26; j++) {
				if (b == (97 + j) && x[j] == (-1)) {
					x[j] = i;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < 26; i++) {
			System.out.print(x[i]+" ");
		}
	}
}