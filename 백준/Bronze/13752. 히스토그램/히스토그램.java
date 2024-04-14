import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			int count = sc.nextInt();
			for(int j=0; j<count; j++) {
				result.append("=");
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}
}