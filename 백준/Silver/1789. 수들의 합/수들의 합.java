import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long S = Long.parseLong(sc.next());
		int i=1;
		int N=0;
		while(S>=i) {
			S-=i;
			i++;
			N++;
		}
		System.out.println(N);
	}
}