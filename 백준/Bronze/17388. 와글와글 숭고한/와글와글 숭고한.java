import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int S=sc.nextInt(), K=sc.nextInt(), H=sc.nextInt();
		
		if(S+K+H>=100) {
			System.out.println("OK");
		}else {
			if(S<K && S<H) {
				System.out.println("Soongsil");
			}else if (K<S && K<H) {
				System.out.println("Korea");
			}else {
				System.out.println("Hanyang");
			}
		}
	}
}