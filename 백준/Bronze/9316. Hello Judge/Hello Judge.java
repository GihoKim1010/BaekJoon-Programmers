import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		StringBuilder result = new StringBuilder();
		for(int i =1; i<=N; i++) {
			result.append("Hello World, Judge ").append(i).append("!").append("\n");
		}
		System.out.println(result.toString());
	}
}