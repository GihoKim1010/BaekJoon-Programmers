import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		boolean[] result=new boolean[N+1];
		
		for(int i=2; i<=N; i++) {
			result[i]=true;
		}
		result[1]=false;	//1은 항상 false
		
		for(int i=2; i*i<=N; i++) {
			if(result[i]) {
				for(int j=i*i; j<=N; j+=i) {
					result[j]=false;
				}
			}
		}
		
		for(int i=M; i<=N; i++) {
			if(result[i]) {
				System.out.println(i);
			}
		}
	}
}
