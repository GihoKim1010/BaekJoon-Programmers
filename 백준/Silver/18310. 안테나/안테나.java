import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] houses = new int[n];
		
		for(int i=0; i<n; i++) {
			houses[i]=sc.nextInt();
		}
		
		Arrays.sort(houses);
		
		if(n%2==0) {
			System.out.println(houses[n/2-1]);
		}else {
			System.out.println(houses[n/2]);
		}
	}
}