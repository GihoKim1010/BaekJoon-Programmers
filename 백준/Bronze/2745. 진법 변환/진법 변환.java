import java.util.Scanner;

public class Main {
	
	 public static int convertToDecimal(String number, int base) {
	        int decimal = 0;
	        int length = number.length();

	        for (int i = 0; i < length; i++) {
	            char digit = number.charAt(i);

	            // 문자를 숫자로 변환
	            int digitValue;
	            if (Character.isDigit(digit)) {
	                digitValue = digit - '0';	//아스키코드 상태이므로, 0에 해당하는 코드를 빼서 그 숫자로 만듦.
	            } else {
	                digitValue = Character.toUpperCase(digit) - 'A' + 10; //A부터 차례대로 10,11,...지정
	            }

	            // 현재 자릿수의 값 계산 및 덧셈
	            decimal = decimal * base + digitValue;
	        }

	        return decimal;
	    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String number=sc.next();
		int base = sc.nextInt();
		int result= convertToDecimal(number, base);
		System.out.println(result);
		
	}
}