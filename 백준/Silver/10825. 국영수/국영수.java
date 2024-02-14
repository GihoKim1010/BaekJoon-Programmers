import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String[]> index = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			String[] ar = input.split(" ");
			index.add(ar);
		}
		Collections.sort(index,
				Comparator.<String[], Integer>comparing(ar -> Integer.parseInt(ar[1]), Comparator.reverseOrder())
				.thenComparing(Comparator.<String[],Integer>comparing(ar -> Integer.parseInt(ar[2])))
				.thenComparing(Comparator.<String[],Integer>comparing(ar -> Integer.parseInt(ar[3]), Comparator.reverseOrder()))
				.thenComparing(Comparator.<String[],String>comparing(ar -> String.valueOf(ar[0]))));
		
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < index.size(); i++) {
			result.append(index.get(i)[0]).append("\n");
		}
		System.out.println(result.toString());
	}
}