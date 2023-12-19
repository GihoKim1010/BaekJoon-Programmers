import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//입력받은 문자를 char형태로 변환
		String a=sc.next();
		char b=a.charAt(0);
		
		//아스키코드로 변환.
		int c=(int) b;
		System.out.println(c);
	}
}