import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		int N = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=N; i++) {
			result.append(i).append(". ").append(sc.nextLine()).append("\n");
		}
		System.out.println(result.toString());
	}
}