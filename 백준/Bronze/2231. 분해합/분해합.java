import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int x=0;
		int result=1;
		int judge=0;
		
		while(result<=N) {
			int temp=result;	//자릿수 분해용
			int sum=temp;	//자릿수 더해볼 숫자
			while(temp/10 !=0) {
				sum+=(temp%10);
				temp/=10;
			}
			sum+=temp;
			
			if (sum==N) {
				judge=1;
				break;
			}else {
				result++;
			}
		}
		if(judge==1) {
			System.out.println(result);
		}else {
			System.out.println(0);
		}
	}
}
