import java.util.Scanner;

public class Main {

	//지수법칙 이용
	public static long calc (long a, long b, long c) {
		//지수가 1인경우
		if(b==1) {
			return a%c;
		}
		
		long temp = calc(a, b/2, c);
		
		if(b%2 == 1) {
			//모듈러 성질 이용. (a*b)%c = ((a%c)*(b%c))%c
			return (temp*temp%c)*a%c;
		}
		return temp*temp%c;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong(), b=sc.nextLong(), c=sc.nextLong();
		
		System.out.println(calc(a,b,c));
	}
}