import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		int result = N;

		for (int i = 0; i < N; i++) {
			int judge=0;
			String word = sc.nextLine();
			char[] alphabet = new char[word.length()];

			for (int j = 0; j < word.length(); j++) {
				char character = word.charAt(j);
				alphabet[j] = character;
			}

			for (int j = 0; j < word.length() - 2; j++) {
				if (alphabet[j] != alphabet[j + 1]) {
					for (int k = j + 2; k < word.length(); k++) {
						if (alphabet[j] == alphabet[k] && word.length()>2) {
							judge=1;
						}
					}
				}
			}
			result=result-judge;
		}
		
		System.out.println(result);
	}
}