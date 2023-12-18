import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String star="";

		for (int i = 0; i < N; i++) {
			star=star+"*";
			System.out.println(star);
		}
	}
}