import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static String makeString(int x) {
		String result = String.valueOf(x);
		result=result.replaceAll("0", "zero");
		result=result.replaceAll("1", "one");
		result=result.replaceAll("2", "two");
		result=result.replaceAll("3", "three");
		result=result.replaceAll("4", "four");
		result=result.replaceAll("5", "five");
		result=result.replaceAll("6", "six");
		result=result.replaceAll("7", "seven");
		result=result.replaceAll("8", "eight");
		result=result.replaceAll("9", "nine");
		return result;
	}
	
	public static int makeInt(String y) {
		y=y.replaceAll("zero", "0");
		y=y.replaceAll("one", "1");
		y=y.replaceAll("two", "2");
		y=y.replaceAll("three", "3");
		y=y.replaceAll("four", "4");
		y=y.replaceAll("five", "5");
		y=y.replaceAll("six", "6");
		y=y.replaceAll("seven", "7");
		y=y.replaceAll("eight", "8");
		y=y.replaceAll("nine", "9");
		int result = Integer.parseInt(y);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt(), n=sc.nextInt();
		String[] numbers = new String[n-m+1];
		
		for(int i=m; i<=n; i++) {
			int x = i;
			numbers[i-m]=makeString(x);
		}
		
		Arrays.sort(numbers);
		
		StringBuilder answer = new StringBuilder();
		int isTen=0;
		
		for(String x : numbers) {
			answer.append(makeInt(x)+ " ");
			isTen++;
			
			if(isTen==10) {
				answer.append("\n");
				isTen=0;
			}
		}
		System.out.println(answer.toString());
	}
}