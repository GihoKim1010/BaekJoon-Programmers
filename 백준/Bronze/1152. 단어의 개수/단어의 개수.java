import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력받은 문자열 x
		String x = sc.nextLine();

		if (x.equals(" ")) {
			System.out.println(0);
		} else {
			// 공백 기준으로 단어 분리
			String[] y = x.split(" ");

			// 출력. 첫 단어 앞에 공백이 올 경우 "" (" "아님)을 검출하여 -1로 빼줌.
			if (y[0].equals("")) {
				System.out.println(y.length - 1);
			} else {
				System.out.println(y.length);
			}
		}
	}
}
