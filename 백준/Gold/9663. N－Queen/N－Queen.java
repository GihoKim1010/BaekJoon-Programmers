import java.util.Scanner;

public class Main {

	public static int[] board;
	public static int n;
	public static int count;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		board = new int[n];
		count = 0;

		putQueen(0);
		System.out.println(count);
	}

	public static void putQueen(int depth) {
		if (depth == n) {
			count++;
			return;
		}

		for(int i=0; i<n; i++) {
			board[depth]=i;
			
			if(possibility(depth)) {
				putQueen(depth+1);
			}
		}
		
	}
	
	public static boolean possibility(int depth) {
		for(int i=0; i<depth; i++) {
			if(board[depth]==board[i]) {
				return false;
			}else if(Math.abs(depth-i)==Math.abs(board[depth]-board[i])) {
				return false;
			}
		}
		return true;
	}
}