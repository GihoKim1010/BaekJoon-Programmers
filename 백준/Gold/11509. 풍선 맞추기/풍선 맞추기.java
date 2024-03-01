import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] height = new int[1000002];
		for (int i = 0; i < n; i++) {
			int input = sc.nextInt();
			
			height[input]++;
			
			if(height[input+1]>0) {
				height[input+1]--;
			}
		}
		int count=0;
		for(int x:height) {
			count+=x;
		}
		System.out.println(count);
	}
}