import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int number=A*B*C;
		String temp = String.valueOf(number);
		int[] result=new int[10];
		
		for(int i=0; i<temp.length();i++) {
			char x=temp.charAt(i);
			int y=(int) (x-'0');
			result[y]++;
		}
		
		for(int x:result) {
			System.out.println(x);
		}
	}
}