import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] classes = new int[N];
		
		for(int i=0; i<N; i++) {
			classes[i]=sc.nextInt();
		}
		
		int B = sc.nextInt(), C = sc.nextInt();
		long sum =0;
		
		for(int i=0; i<N; i++) {
			sum++;
			
			if(classes[i]>B) {
				int temp = classes[i]-B;
				sum+= (temp%C==0) ? temp/C : temp/C + 1;
			}
		}
		System.out.println(sum);
	}
}