import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int count=1;
			BigInteger answer = BigInteger.ONE;
			while(true) {
				if(answer.remainder(BigInteger.valueOf(n))==BigInteger.ZERO) {
					result.append(count).append("\n");
					break;
				}else {
					count++;
					answer=answer.multiply(BigInteger.TEN).add(BigInteger.ONE);
				}
			}
		}
		System.out.println(result.toString());
	}
}