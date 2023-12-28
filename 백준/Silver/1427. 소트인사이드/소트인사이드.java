import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String N = sc.next();
		
		//배열 x에 한숫자씩 저장
		int[] x=new int[N.length()];
		for(int i =0; i<N.length(); i++) {
			char y=N.charAt(i);
			int z=Character.getNumericValue(y);
			x[i]=z;
		}
		Arrays.sort(x);
		
		for(int i=x.length-1; i>=0; i--) {
			System.out.print(x[i]);
		}
	}
}