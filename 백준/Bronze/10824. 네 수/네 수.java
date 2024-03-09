import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] temp = input.split(" ");
		StringBuilder ab = new StringBuilder(temp[0]);
		ab.append(temp[1]);
		StringBuilder cd = new StringBuilder(temp[2]);
		cd.append(temp[3]);
		
		long longAb = Long.parseLong(ab.toString());
		long longCd = Long.parseLong(cd.toString());
		System.out.println(longAb+longCd);
	}
}