import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 총금액 X, 구매한 물건 종류 N.
		int X = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();

		int[] price = new int[N];
		int total = 0;

		// 물건 금액 + 갯수를 y로 입력받고, z를 매개로 가격z[0]와 ,갯수z[1]로 분리.
		//분리한 z[0]*z[1]로 물건당 지불 가격을 price[i]에 저장.
		for (int i = 0; i < N; i++) {
			String y = sc.nextLine();
			String[] temp = y.split(" ");
			int[] z = new int[temp.length];

			for (int j = 0; j < temp.length; j++) {
				z[j] = Integer.parseInt(temp[j]);
			}
			price[i] = z[0] * z[1];
			total += price[i];
		}
		
		//가격 비교 판정
		if(total==X) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}