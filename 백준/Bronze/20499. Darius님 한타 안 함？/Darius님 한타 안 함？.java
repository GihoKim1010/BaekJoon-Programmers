import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] temp = input.split("/");
		int K = Integer.parseInt(temp[0]);
		int D = Integer.parseInt(temp[1]);
		int A = Integer.parseInt(temp[2]);
		if(K+A<D || D==0) {
			System.out.println("hasu");
		}else {
			System.out.println("gosu");
		}
	}
}