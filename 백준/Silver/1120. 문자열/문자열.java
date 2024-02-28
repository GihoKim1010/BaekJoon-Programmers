import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next(), b = sc.next();
		int lengthA = a.length(), lengthB = b.length(), diff = lengthB - lengthA;
		int min = lengthA;
		for (int i = 0; i <= diff; i++) {
			int count = 0;
			for (int j = 0; j < lengthA; j++) {
				if (a.charAt(j) != b.charAt(j+i)) {
					count++;
				}
			}
			min = Math.min(count, min);
		}
		System.out.println(min);
	}
}