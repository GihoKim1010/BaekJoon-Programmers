import java.util.Scanner;

public class Main {

	public static int fibonachi(int n) {

		if (n >= 2) {
			return fibonachi(n - 1) + fibonachi(n - 2);
		} else if (n==1){
			return fibonachi(n - 1) + 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(fibonachi(n));

	}
}