import java.util.Scanner;

public class Main {

	static StringBuilder answer;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int N = sc.nextInt();
			int length = (int) Math.pow(3, N);
			answer=new StringBuilder();
			
			for(int i =0; i<length; i++ ) {
				answer.append("-");
			}
			
			func(0,length);
			System.out.println(answer.toString());
		}
	}

	public static void func(int start, int size) {
		if (size == 1) {
			return;
		}
		int newSize = size / 3;

		for (int i = start + newSize; i < start + 2 * newSize; i++) {
			answer.setCharAt(i, ' ');
		}
		
		func(start, newSize);
		func(start+2*newSize, newSize);
	}
}