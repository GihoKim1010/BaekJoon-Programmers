import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		boolean[] seat = new boolean[101];
		int answer =0;
		
		for(int i=0; i<N; i++) {
			int want = sc.nextInt();
			if(seat[want]) {
				answer++;
			}else {
				seat[want]=true;
			}
		}
		System.out.println(answer);
	}
}