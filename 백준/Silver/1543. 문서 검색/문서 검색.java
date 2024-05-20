
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String search = sc.nextLine();
		int length = sentence.length();
		
		sentence=sentence.replaceAll(search, "");
		int dif = length-sentence.length();
		System.out.println(dif/search.length());
	}
}