import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] distance = new int[N-1];
		int[] price = new int[N];
		
		for(int i =0; i<N-1; i++) {
			distance[i]=sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			price[i] = sc.nextInt();
		}

		int min_price = 1000000000;
		BigInteger money = BigInteger.ZERO;
		
		for(int i=0; i<N-1; i++) {
			min_price = Math.min(min_price, price[i]);
			BigInteger temp = BigInteger.valueOf(min_price*distance[i]);
			money = money.add(temp);
		}
		
		System.out.println(money);
	}

}