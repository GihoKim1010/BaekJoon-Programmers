import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt(), l=sc.nextInt();
		int[] h = new int[n];
		
		for(int i=0; i<n; i++) {
			h[i]=sc.nextInt();
		}
		Arrays.sort(h);
		
		for(int i=0; i<n; i++) {
			if(l>=h[i]) {
				l++;
			}
		}
		System.out.println(l);
	}
}