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
		arr[2]=1;
		arr[3]=2;
		System.out.println(fibonacci(n)+" "+(n-2));
	}
	
	private static long fibonacci(int n) {
		if(arr[n]==-1) {
			arr[n]=fibonacci(n-1)+fibonacci(n-2);
		}
		
		return arr[n];
	}
}