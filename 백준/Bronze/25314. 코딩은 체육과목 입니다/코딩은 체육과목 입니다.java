import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 입력값 N, 이에 따라 출력에 써질 long의 갯수 x.
		int N = sc.nextInt();
		int x;
		
		if((N%4)==0) {
			x=N/4;
		}else {
			x=(N/4)+1;
		}
		
		//출력될 메세지 result.
		String result = new String("int");
		for(int i=0; i<x; i++) {
			result="long "+result;
		}
		
		System.out.println(result);
	}
}