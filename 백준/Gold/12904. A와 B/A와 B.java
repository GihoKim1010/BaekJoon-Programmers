import java.util.Scanner;

public class Main {
	
	public static StringBuilder word;
	public static int length;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine(), t=sc.nextLine();
		word=new StringBuilder(t);
		length=s.length();
		makeWord();
		if(word.toString().equals(s)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}
	
	public static void makeWord() {
		if(word.length()==length) {
			return;
		}else {
			if(word.charAt(word.length()-1)=='A') {
				word.deleteCharAt(word.length()-1);
				makeWord();
			}else {
				word.deleteCharAt(word.length()-1);
				word=word.reverse();
				makeWord();
			}
		}
	}
}