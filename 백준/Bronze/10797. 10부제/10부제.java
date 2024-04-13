import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		for(int i=0; i<5; i++) {
			int car = sc.nextInt();
			if(N==car) {
				count++;
			}
		}
		System.out.println(count);
	}
}