import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static long[] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		arr=new long[n+1];
		Arrays.fill(arr, -1);
		arr[0]=0;
		arr[1]=1;
		System.out.println(fibonacci(n));
	}
	
	private static long fibonacci(int n) {
		if(arr[n]==-1) {
			arr[n]=fibonacci(n-1)+fibonacci(n-2);
		}
		
		return arr[n];
	}
}