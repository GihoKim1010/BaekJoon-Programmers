import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		while(true) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}else {
				if(a>b) {
					result.append("Yes").append("\n");
				}else {
					result.append("No").append("\n");
				}
			}
		}
		System.out.println(result.toString());
	}
}