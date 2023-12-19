import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 10칸짜리 배열 생성
		int[] list = new int[10];

		// 10번의 n을 입력받아 42로 나눈 나머지를 구해서 list에 저장.
		for (int a = 0; a < 10; a++) {
			int n = sc.nextInt();
			list[a] = n % 42;
		}

		// list 내에 같은 값이 있는지 확인하며, 중복될 경우 하나에 +42를 함.
		int x = 0;
		for (int b = 0; b < 10; b++) {
			for (int c = 9; c > b; c--) {
				if (list[b] == list[c]) {
					list[c]=list[c]+42;
				}
			}
		}
		//중복되어 제외한 값들은 42 이상이므로, 이를 제외하고 센 갯수 count를 얻음.
		int count=0;
		
		for (int d = 0; d<10; d++) {
			if (list[d]<42) {
				count=count+1;
			}
		}
		
		//출력
		System.out.println(count);
	}
}