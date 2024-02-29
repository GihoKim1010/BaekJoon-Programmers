import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static char[] alphabets;
	public static StringBuilder answer;
	public static StringBuilder words;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		answer=new StringBuilder();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String input = sc.nextLine();
			int length = input.length();
			alphabets = input.toCharArray();
			words = new StringBuilder();
			int[] check = new int[26];
			for(char x : alphabets) {
				check[x-'a']++;
			}
			Arrays.sort(alphabets);
			anagram(check, 0,length);
		}
		System.out.println(answer.toString());
	}
	
	public static void anagram(int[] check, int depth, int length) {
		if(depth==length) {
			answer.append(words+ "\n");
			return;
		}
		
		for(int i=0; i<26; i++) {
			if(check[i]>0) {
				check[i]--;
				words.append((char)(i+'a'));
				anagram(check, depth+1, length);
				words.deleteCharAt(words.length()-1);
				check[i]++;
			}
		}
	}
}