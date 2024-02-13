import java.util.Scanner;

public class Main {

	public static int sum(String x) {
		String[] numbers = x.split("\\+");
		int result = 0;
		for(int i=0; i<numbers.length; i++) {
			result+=Integer.valueOf(numbers[i]);
		}
		return result;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] removeMinus = input.split("-");
		int answer =0;
		for(int i=0; i<removeMinus.length; i++) {
			if(i==0) {
				answer+=sum(removeMinus[i]);
			}else {
				answer-=sum(removeMinus[i]);
			}
		}
		System.out.println(answer);
	}
}