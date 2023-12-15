import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		
		str=sc.nextLine();
		
		String[] str2=str.split(" ");
		int[] number=new int[str2.length];
		
		for(int i=0; i<str2.length; i++) {
			number[i]=Integer.parseInt(str2[i]);
		}
		
		int a=number[0];
		int b=number[1];
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else if(a==b) {
			System.out.println("==");
		}
	}
}