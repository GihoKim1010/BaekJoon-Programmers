import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int[] numbers = new int[N];
		
		for(int i=0; i<N; i++) {
			numbers[i]=sc.nextInt();
		}
		
		Arrays.sort(numbers);
		int result = 0;
		
		if(N%2==1) {
			result=numbers[(N-1)/2]*numbers[(N-1)/2];
		}else {
			result=numbers[N/2]*numbers[N/2-1];
		}
		System.out.println(result);
	}
}