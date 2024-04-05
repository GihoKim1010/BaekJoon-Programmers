import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i=N; i>=1; i--) {
			result.append(i).append("\n");
		}
		System.out.println(result.toString());
	}
}