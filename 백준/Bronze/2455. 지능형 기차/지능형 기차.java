import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count=0;
		int max=0;
		
		for(int i=0; i<4; i++) {
			int minus = sc.nextInt();
			int plus = sc.nextInt();
			count = count-minus+plus;
			max=Math.max(count, max);
		}
		
		System.out.println(max);
	}
}