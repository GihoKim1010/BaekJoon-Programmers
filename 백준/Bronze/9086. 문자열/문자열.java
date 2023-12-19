import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트갯수 T.
		int T = sc.nextInt();
		sc.nextLine();

		//결과를 저장할 ArrayList
		ArrayList<String> result = new ArrayList<>();
		
		// 테스트 할 문자열들.
		for (int i = 0; i < T; i++) {
			String S = sc.nextLine();
			char first=S.charAt(0);
			char last=S.charAt(S.length()-1);
			String stFirst=String.valueOf(first);
			String stLast=String.valueOf(last);
			result.add(stFirst+stLast);
		}
		
		//저장한 값들을 출력
		for (String x : result) {
			System.out.println(x);
		}
	}
}