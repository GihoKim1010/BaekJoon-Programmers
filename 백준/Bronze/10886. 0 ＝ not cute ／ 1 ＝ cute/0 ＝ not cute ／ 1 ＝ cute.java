import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int judge=0;
		for(int i=0; i<N; i++) {
			int say = sc.nextInt();
			if(say==0) {
				judge--;
			}else {
				judge++;
			}
		}
		
		if(judge>0) {
			System.out.println("Junhee is cute!");
		}else {
			System.out.println("Junhee is not cute!");
		}
	}
}