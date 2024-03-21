import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result.append(" ");
            }
            for (int j = 1; j <= 2*(n-i)-1; j++) {
                result.append("*");
            }
            result.append("\n");
        }
        System.out.print(result);
	}
}