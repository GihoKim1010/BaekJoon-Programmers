import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> A = new ArrayList<String>();
		
		//EOF를 분별하여 ArrayList에 저장
		while(sc.hasNext()) {
			A.add(sc.nextLine());
		}
		
		//출력
		for(String B : A)
		System.out.println(B);
	}
}