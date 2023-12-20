import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//문자열 A를 받아 공백 기준으로 B에 스플릿
		String A = sc.nextLine();
		String[] B = A.split(" ");
		int[] C = new int[B.length];
		
		//int로 바꿔서 C[]에 저장
		for(int i=0; i<B.length; i++) {
			C[i]=Integer.parseInt(B[i]);
		}
		
		//저장된 C[] 값들을 출력할 값들로 변환
		C[0]=1-C[0];
		C[1]=1-C[1];
		C[2]=2-C[2];
		C[3]=2-C[3];
		C[4]=2-C[4];
		C[5]=8-C[5];
	
		//출력
		for(int i=0; i<C.length; i++) {
			System.out.print(C[i]+" ");
		}
	}
}