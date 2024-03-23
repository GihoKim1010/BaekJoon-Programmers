import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			String input = sc.nextLine();
			String[] temp = input.split(",");
			int A=Integer.parseInt(temp[0]), B=Integer.parseInt(temp[1]);
			result.append(A+B).append("\n");
		}
		System.out.println(result.toString());
	}
}