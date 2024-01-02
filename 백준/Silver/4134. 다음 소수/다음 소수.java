import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] result=new long[N];

		for (int i = 0; i < N; i++) {
			long n = sc.nextLong();
			long test = n;

			while (true) {
				int temp = 0;
				
				if(test ==1 || test ==0) {
					result[i]=2;
					break;
				}
				for (int j = 2; j <= Math.sqrt(test); j++) {
					if (test % j == 0) {
						temp++;
						break;
					}
				}
				if (temp != 0) {
					test++;
				} else if (temp == 0) {
					result[i]=test;
					break;
				}
			}
		}
		for(long a:result) {
			System.out.println(a);
		}
	}
}