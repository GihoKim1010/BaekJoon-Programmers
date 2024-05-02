import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] sensor = new int[N];
		int[] dif = new int[N-1];
		
		for(int i=0; i<N; i++) {
			sensor[i]=sc.nextInt();
		}
		
		Arrays.sort(sensor);
		
		for(int i=0; i<N-1; i++) {
			dif[i]=sensor[i+1]-sensor[i];
		}
		
		Arrays.sort(dif);
		
		int sum = 0;
		
		for(int i=0; i<N-K; i++) {
			sum+=dif[i];
		}
		System.out.println(sum);
	}
}