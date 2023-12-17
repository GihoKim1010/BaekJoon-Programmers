import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		sc.nextLine();
		int[] test = new int[T];
		int d=0;
		
		for (int j = 0; j < T; j++) {
			String a = sc.nextLine();

			String[] b = a.split(" ");
			int[] c = new int[b.length];
			
			for (int i = 0; i < b.length; i++) {
				c[i] = Integer.parseInt(b[i]);
				d=c[0]+c[1];
				}
			test[j]=d;
			}
		
		for(int k=0; k<test.length; k++) {
			System.out.println(test[k]);
		}
	}
}