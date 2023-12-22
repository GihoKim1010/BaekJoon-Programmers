import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 N 입력
		int N =sc.nextInt();
		
		//소인수 분해 한 숫자 저장할 ArrayList
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//소인수 분해. 중간 계산값을 cal에 저장
		int cal=N;
		for(int i=2; i<=N; i++) {
			while(cal%i==0) {
				cal=cal/i;
				numbers.add(i);
			}
		}
		
		//출력
		if(N>1) {
			for(int x:numbers)
			System.out.println(x);
		}
	}
}