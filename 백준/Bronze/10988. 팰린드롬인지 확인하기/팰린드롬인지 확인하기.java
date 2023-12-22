import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//입력받은 word를 알파벳 하나하나 분리하여 배열에 저장
		String word = sc.next();
		String[] character=new String[word.length()];
		for(int i=0; i<word.length(); i++) {
			char a=word.charAt(i);
			character[i]=String.valueOf(a);
		}
		
		//팰린드롬인지 아닌지 판정
		int judge = 1;		
		
		for (int i=0; i<character.length/2; i++) {
			if (!character[i].equals(character[character.length-i-1])) {
				judge=0;
			}
		}
		
		//출력
		System.out.println(judge);
		
	}
}