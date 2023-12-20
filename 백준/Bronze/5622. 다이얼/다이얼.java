import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력받은 문자열 x
		String x = sc.nextLine();

		// 문자를 하나씩 분리하여 y[]에 아스키코드(A:65~Z:90)으로 저장
		char[] z = new char[x.length()];

		for (int i = 0; i < x.length(); i++) {
			char y = x.charAt(i);
			z[i] = (char) ((int) y);
		}

		// A~C가 "/3" 값이 다 같은 값을 가지게 배열 안의 값을 변경하여 A[]에 저장 (-2)
		int[] A = new int[z.length];
		for (int i = 0; i < z.length; i++) {
			A[i] = z[i] - 2;
			if (A[i] > 80) { // S가 네개째의 알파벳으로 들어간 것에 대한 처리
				A[i] = A[i] - 1;
			}
		}

		// 알파벳에 해당하는 숫자까지 돌릴 때의 시간으로 변경.ABC가 63~65 이므로, /3하면 전부 21이됨.
		int sum = 0;
		for (int i = 0; i < z.length; i++) {
			if (A[i] == 87) { // Z인 경우.
				int sec = (A[i] / 3) - 19;
				sum = sum + sec;
			} else {
				int sec = (A[i] / 3) - 18;
				sum = sum + sec;
			}
		}
		System.out.println(sum);
	}
}