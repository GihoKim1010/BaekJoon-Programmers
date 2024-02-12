import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while(sc.hasNext()) {
			sb.append(sc.nextLine()).append("\n");
		}
		System.out.println(sb.toString());
	}
}