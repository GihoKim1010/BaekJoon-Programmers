import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(), P = sc.nextInt();
		int result = L*P;
		StringBuilder answer = new StringBuilder();
		
		for(int i=0; i<5; i++) {
			int input = sc.nextInt();
			answer.append(input-result).append(" ");
		}
		
		System.out.println(answer.toString());
	}
}