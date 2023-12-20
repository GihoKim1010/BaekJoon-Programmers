import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 첫째줄에 입력받을 N. 개행문자 소비.
		int N = sc.nextInt();
		sc.nextLine();

		// 두번째줄에 입력받은 숫자를 문자열로 받음.
		String a = sc.next();

		// 문자열로 받은 숫자를 숫자 하나하나로 분리 후 sum에 합침.
		int sum = 0;

		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			int c = Character.getNumericValue(b);
			sum += c;
		}
		System.out.println(sum);
	}
}