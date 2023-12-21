import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//행렬 및 max값과 그에 해당하는 a행 b열을 나타낼 max, a,b 생성
		int[][] matrix= new int[9][9];
		int a=1;
		int b=1;
		int max=0;
		
		//입력받은 값을 행렬에 저장
		for (int i=0; i<9; i++) {
			String insert=sc.nextLine();
			String[] str_Num=insert.split(" ");
			for (int j=0; j<9; j++) {
				matrix[i][j]=Integer.parseInt(str_Num[j]);
				
				//최댓값 검출
				if(matrix[i][j]>max) {
					max=matrix[i][j];
					a=i+1;
					b=j+1;
				}
			}
		}
		//출력
		System.out.println(max);
		System.out.println(a+" "+b);
	}
}