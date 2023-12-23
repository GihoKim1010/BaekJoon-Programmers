import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//A,B,V 입력
		int A=sc.nextInt();
		int B=sc.nextInt();
		int V=sc.nextInt();
		
		int per_Day=A-B;
		int X=V-A;
		
		//올림처리
		if (X%per_Day>0) {
			System.out.println(X/per_Day+2);
		}else {
			System.out.println(X/per_Day+1);
		}
	}
}