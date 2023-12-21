import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		 100*100 행렬로 만들어 색종이가 덮힌 부분을 1, 아니면 0.
//		 행렬로 만들기 편하게 하기 위해 y축의 방향을 위가아닌 아래로 생각
//		 3 7 이 주어지면 꼭짓점이[7][3]에 시작되지만, 넓이만 구하면 되므로 편하게 [3][7]로 가정.
//		 3 7 이 주어지면 [3~12][7~16]이 1로 변경되는셈.

		// 행렬 생성.
		int[][] xx = new int[100][100];

		// 색종이 갯수 입력
		int N = sc.nextInt();
		sc.nextLine();

		// 색종이 꼭짓점 좌표 입력
		int x = 0;
		int y = 0;

		for (int i = 0; i < N; i++) {
			String paper = sc.nextLine();
			String[] xy = paper.split(" ");
			x = Integer.parseInt(xy[0]);
			y = Integer.parseInt(xy[1]);
			
			for(int j=0; j<10; j++) {
				for(int k=0; k<10; k++) {
					xx[x+j][y+k]=1;
				}
			}
		}
		
		//1의 갯수 검출
		int count=0;
		
		for (int i=0; i<100; i++) {
			for (int j=0; j<100; j++) {
				if (xx[i][j] ==1) {
					count=count+1;
				}
			}
		}
		//출력
		System.out.println(count);
	}
}