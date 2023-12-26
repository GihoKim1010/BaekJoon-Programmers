import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//막대 3개의 길이.
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if(a+b<=c) {
			System.out.println(2*(a+b)-1);
		}else if(b+c<=a){
			System.out.println(2*(b+c)-1);
		}else if(c+a<=b){
			System.out.println(2*(c+a)-1);
		}else {
			System.out.println(a+b+c);
		}
	}
}