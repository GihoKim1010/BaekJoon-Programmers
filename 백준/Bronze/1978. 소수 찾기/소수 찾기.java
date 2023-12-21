import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//첫째줄의 N입력
		int N=sc.nextInt();
		
		//N개의 숫자에 대해 2 ~ num-1 로 나눠보고, 약수가 있으면 judge의 값을 변경. count에 소수 갯수저장.
		int count=0;
		
		for(int i=0; i<N; i++) {
			int num=sc.nextInt();
			
			int judge=0;
			
			for(int j=2; j<num; j++) {
				if(num%j == 0) {
					judge=judge+1;
				}
			}
			
			//1은 소수가 아니므로 제외.
			if (judge==0 && num >1) {
				count=count+1;
			}
		}
		
		//출력
		System.out.println(count);
	}
}