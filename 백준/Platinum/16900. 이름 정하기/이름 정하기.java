import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	private static String S;
	private static int[] pi;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		S=sc.next();
		int K = sc.nextInt();
		pi=new int[S.length()];
		makePi();
		BigInteger result = BigInteger.valueOf(S.length()).multiply(BigInteger.valueOf(K));
		BigInteger subtraction = BigInteger.valueOf(K - 1).multiply(BigInteger.valueOf(pi[S.length() - 1]));
		result = result.subtract(subtraction);
		System.out.println(result.toString());
	}
	
	private static void makePi() {
		int index =0;
		for(int i=1; i<S.length(); i++) {
			while(index>0 && S.charAt(index)!=S.charAt(i)) {
				index = pi[index-1];
			}
			
			if(S.charAt(index)==S.charAt(i)) {
				index++;
				pi[i]=index;
			}
		}
	}
}