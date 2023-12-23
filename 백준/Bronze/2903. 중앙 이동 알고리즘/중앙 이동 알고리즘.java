import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	//1=3, 2=5, 3=9 4=17, B=2B-1
		
		Scanner sc= new Scanner(System.in);
		
		//주어진값 N. 출력값 result.
		int N=sc.nextInt();
		int result=3;
		
		for(int i=1; i<N; i++) {
			result=2*result-1;
		}
		
		System.out.println(result*result);
		
	}
}