import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력받은 숫자 9개를 N배열에 저장
		int[] N = new int[9];

		for (int i = 0; i < 9; i++) {
			N[i]=sc.nextInt();
		}

		// 최대값, 위치a
		int max = N[0];
		int a = 1;
		for (int i = 0; i < N.length; i++) {
			if (max < N[i]) {
				max = N[i];
				a=i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(a);
	}
}