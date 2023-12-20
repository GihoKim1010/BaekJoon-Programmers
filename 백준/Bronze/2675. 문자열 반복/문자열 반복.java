import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스 갯수 T
		int T = sc.nextInt();
		sc.nextLine();

		// 출력값들을 저장해둘 result[] 생성
		String[] result = new String[T];
		

		// 테스트 케이스들을 반복횟수 R과 문자열 S로 분리
		for (int i = 0; i < T; i++) {
			String RS = sc.nextLine();
			String[] split_RS = RS.split(" ");
			int R = Integer.parseInt(split_RS[0]);
			String S = split_RS[1];
			

			// S를 문자 하나하나 분리하여 배열 x[]에 저장.
			char[] x = new char[S.length()];

			for (int j = 0; j < S.length(); j++) {
				x[j] = S.charAt(j);
			}

			// result[]에 저장할 문자열 생성
			result[i]="";
			
			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					result[i] = result[i] + x[j];
				}
			}
		}
		
		// 출력
		for (int i = 0; i < T; i++) {
			System.out.println(result[i]);
		}
	}
}