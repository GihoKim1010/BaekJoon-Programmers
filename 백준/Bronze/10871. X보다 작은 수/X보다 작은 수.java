import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//첫째줄 N과 X로 분리 (int_NX[0]=N, [1]=X)
		String NX = sc.nextLine();
		String[] sp_NX=NX.split(" ");
		int [] int_NX=new int[sp_NX.length];
		
		for(int i=0; i<sp_NX.length; i++) {
			int_NX[i]=Integer.parseInt(sp_NX[i]);
		}
		
		int N=int_NX[0];
		int X=int_NX[1];
		
		// x, y 는 둘째 줄을 공백 기준으로 분리하여 int 형식으로 z배열에 저장하기 위한 임시 배열.
		String x = sc.nextLine();
		String[] y = x.split(" ");
		int count = 0;
		int[] z = new int[y.length];

		for (int i = 0; i < N; i++) {
			z[i] = Integer.parseInt(y[i]);
			}
		
		//작은거 전부 출력
		for (int i = 0; i<z.length; i++) {
			if(z[i]<X) {
				System.out.print(z[i]+" ");
			}
		}
	}
}