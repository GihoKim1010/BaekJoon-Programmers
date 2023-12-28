import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// 유클리드 호제법 사용
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			result.add((A*B)/findGCD(A,B));
		}
		for(int x:result) {
			System.out.println(x);
		}
	}
}