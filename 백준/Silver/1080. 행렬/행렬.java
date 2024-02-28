import java.util.Scanner;

public class Main {

	public static boolean[][] matrix;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), m = sc.nextInt();
		sc.nextLine();
		int[][] a = new int[n][m];
		matrix = new boolean[n][m];
		String input;

		// a행렬 입력받음
		for (int i = 0; i < n; i++) {
			input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				a[i][j] = (int) input.charAt(j);
			}
		}

		// b행렬 값을 입력 받되, 저장하는값은 a 해당부분과 같으면true, 다르면false
		for (int i = 0; i < n; i++) {
			input = sc.nextLine();
			for (int j = 0; j < m; j++) {
				int x = (int) input.charAt(j);
				if (x == a[i][j]) {
					matrix[i][j] = true;
				} else {
					matrix[i][j] = false;
				}
			}
		}

		// 뒤집으려면 가로 세로의 길이가 3 이상이어야함.
		int count =0;
		if (n >= 3 && m >= 3) {
			for (int i = 0; i < n - 2; i++) {
				for (int j = 0; j < m - 2; j++) {
					if (!matrix[i][j]) {
						reverse(i, j);
						count++;
					}
				}
			}
		}

		// 다 true가 되었는지 확인
		boolean judge=true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (!matrix[i][j]) {
					judge=false;
					break;
				}
			}
		}
		if(judge) {
			System.out.println(count);
		}else {
			System.out.println(-1);
		}
	}

	//뒤집기
	public static void reverse(int i, int j) {
		for (int a = i; a < i + 3; a++) {
			for (int b = j; b < j + 3; b++) {
				if (!matrix[a][b]) {
					matrix[a][b]=true;
				}else {
					matrix[a][b]=false;
				}
			}
		}
	}
}