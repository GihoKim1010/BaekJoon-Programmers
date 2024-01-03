import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 10250번 ACM호텔.

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] result=new int[T];
		for (int i = 0; i < T; i++) {
			int a = sc.nextInt(); // 층수
			int b = sc.nextInt(); // 층당 방수
			int c = sc.nextInt(); // 몇번째 손님인가

			int x=c/a+1;
			int y=c%a;
			
			if(y==0) {
				y=a;
				x=x-1;
			}
			
			result[i]=100*y+x;
		}
		for(int d:result) {
			System.out.println(d);
		}
	}
}