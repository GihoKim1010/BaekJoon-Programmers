import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//출력할 내용을 저장할 ArrayList
		ArrayList<String> result = new ArrayList<>();
		
		while(true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}else if(a+b<=c || b+c<=a || c+a <=b) {
				result.add("Invalid");
			}else if(a==b && b==c) {
				result.add("Equilateral");
			}else if(a!=b && b!=c && c!=a) {
				result.add("Scalene");
			}else{
				result.add("Isosceles");
			}
		}
		for(String x:result) {
			System.out.println(x);
		}
	}
}