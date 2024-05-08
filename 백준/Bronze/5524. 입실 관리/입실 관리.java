import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		
		StringBuilder result = new StringBuilder();
		
		for(int i =0; i<N; i++) {
			String input = sc.nextLine();
			String change = input.toLowerCase();
			result.append(change).append("\n");
		}
		
		System.out.println(result.toString());
	}
}