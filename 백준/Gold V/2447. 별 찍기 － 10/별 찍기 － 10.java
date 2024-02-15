import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[][] stars = new String[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				stars[i][j] = "*";
			}
		}

		StringBuilder result = new StringBuilder();
		
		blank(stars, n, 0, 0);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result.append(stars[i][j]);
			}
			result.append("\n");
		}
		System.out.println(result.toString());
	}

	public static void blank(String[][] arr, int n, int x, int y) {
		int size = n / 3;
		for (int i = x+size; i < x + 2*size; i++) {
			for (int j = y+size; j < y + 2*size; j++) {
				arr[i][j]=" ";
			}
		}
		
		if(size>=3) {
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					blank(arr, n/3, x+(i*n/3), y+(j*n/3));
				}
			}
		}
	}
}