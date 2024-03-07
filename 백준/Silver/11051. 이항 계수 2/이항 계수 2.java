import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), k=sc.nextInt();
		
		//(a/b*c) 꼴로 계산
		
		if(k==n || k==0) {
			System.out.println(1);
		}else {
			BigInteger b = BigInteger.ONE;
			for(int i=1; i<=n-k; i++) {
				b=b.multiply(BigInteger.valueOf(i));
			}
			BigInteger c = b;
			for(int i =n-k+1; i<=k; i++) {
				c=c.multiply(BigInteger.valueOf(i));
			}
			BigInteger a=c;
			for(int i=k+1; i<=n; i++) {
				a=a.multiply(BigInteger.valueOf(i));
			}
			BigInteger result = a.divide(b).divide(c);
			result=result.remainder(BigInteger.valueOf(10007));
			String temp = result.toString();
			System.out.println(Integer.parseInt(temp));
		}
	}
}