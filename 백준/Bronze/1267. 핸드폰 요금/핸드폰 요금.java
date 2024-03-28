import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sumY = 0;
		int sumM = 0;
		
		for(int i=0; i<N; i++) {
			int call = sc.nextInt();
			sumY+= (call/30 + 1)*10;
			sumM+= (call/60 + 1)*15;
		}
		
		if(sumY<sumM) {
			System.out.println("Y "+sumY);
		}else if (sumM<sumY) {
			System.out.println("M "+sumM);
		}else {
			System.out.println("Y M "+sumM);
		}
		
	}
}