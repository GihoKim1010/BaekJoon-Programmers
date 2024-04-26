import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[2];
		
		for(int i=0; i<4; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<2; i++) {
			b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		
		int sum = 0;
		for(int i=1; i<4; i++) {
			sum+=a[i];
		}
		
		System.out.println(sum+b[1]);
	}
}