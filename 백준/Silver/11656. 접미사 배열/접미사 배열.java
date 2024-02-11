import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		ArrayList<String> ar = new ArrayList<>();
		for (int i = 0; i < input.length(); i++) {
			ar.add(input.substring(i, input.length()));
		}
		Collections.sort(ar);

		for (String x : ar) {
			System.out.println(x);
		}
	}
}