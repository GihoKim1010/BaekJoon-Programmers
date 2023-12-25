import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] angle=new int[3];
		
		angle[0]=sc.nextInt();
		angle[1]=sc.nextInt();
		angle[2]=sc.nextInt();
		
		if (angle[0]+angle[1]+angle[2] !=180) {
			System.out.println("Error");
		}else if (angle[0]==angle[1] && angle[1]==angle[2]) {
			System.out.println("Equilateral");
		}else if (angle[0]!=angle[1] && angle[1]!=angle[2] && angle[2]!=angle[0]) {
			System.out.println("Scalene");
		}else {
			System.out.println("Isosceles");
		}
	}
}