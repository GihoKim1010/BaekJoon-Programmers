import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int result = 0;
		int i=1;
		
		while(i*i<=N) {
			result++;
			i++;
		}
		System.out.println(result);
	}
}