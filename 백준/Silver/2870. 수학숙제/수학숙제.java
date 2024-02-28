import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> arr = new ArrayList<>();
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] sp = input.split("\\D");
			
			for(int j=0; j<sp.length; j++) {
				if(!sp[j].equals("")) {
					arr.add(new BigInteger(sp[j]));
				}
			}
		}
		Collections.sort(arr);
		
		for(BigInteger x : arr) {
			System.out.println(x);
		}
	}
}