import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();

		// x, y 는 둘째 줄을 공백 기준으로 분리하여 int 형식으로 z배열에 저장하기 위한 임시 배열.
		String x = sc.nextLine();
		String[] y = x.split(" ");
		int v = sc.nextInt();
		int count = 0;
		int[] z = new int[y.length];

		for (int i = 0; i < N; i++) {
			z[i] = Integer.parseInt(y[i]);
			}
		
		for (int i = 0; i<z.length; i++) {
			if(z[i]==v) {
				count=count+1;
			}
		}
		System.out.println(count);
	}
}