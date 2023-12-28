import java.util.Scanner;

public class Main {

	// 유클리드 호제법 사용
	public static long findGCD(long a, long b) {
		while (b != 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		long A=sc.nextInt();
		long B=sc.nextInt();
		
		System.out.println(A*B/findGCD(A,B));
		}
	}