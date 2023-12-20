import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력받은 문자열 x
		String x = sc.nextLine();

		// 공백 기준으로 숫자 분리
		String[] y = x.split(" ");
		int A = Integer.parseInt(y[0]);
		int B = Integer.parseInt(y[1]);
		
		//A,B의 세자리 숫자를 각각 숫자 3개씩으로 분리
		int[] AA = new int[3];
		int[] BB = new int[3];
		
		AA[0] = A/100;
		AA[1] = (A%100)/10;
		AA[2] = A%10;
		
		BB[0] = B/100;
		BB[1] = (B%100)/10;
		BB[2] = B%10;
		
		//상수 기준으로 읽은 숫자 reverse_A, reverse_B 생성
		int reverse_A= AA[2]*100 + AA[1]*10 + AA[0];
		int reverse_B= BB[2]*100 + BB[1]*10 + BB[0];
		
		//출력
		if (reverse_A>reverse_B) {
			System.out.println(reverse_A);
		}else {
			System.out.println(reverse_B);
		}

	}
}
