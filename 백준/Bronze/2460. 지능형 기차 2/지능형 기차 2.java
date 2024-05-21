import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int max=0;
		for(int i=0; i<10; i++) {
			int minus = sc.nextInt();
			int plus = sc.nextInt();
			
			sum=sum-minus+plus;
			max=Math.max(max, sum);
		}
		System.out.println(max);
	}
}