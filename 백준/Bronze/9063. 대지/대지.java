import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N=sc.nextInt();
		int[] x=new int[N];
		int[] y=new int[N];
		
		//입력받은 좌표를 배열에 저장
		for(int i=0; i<N; i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		//배열 속 값을 크기순으로 정렬;
		Arrays.sort(x);
		Arrays.sort(y);
		
		//출력
		System.out.println((x[N-1]-x[0])*(y[N-1]-y[0]));
	}
}