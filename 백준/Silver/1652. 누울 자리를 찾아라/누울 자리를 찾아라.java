import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		char[][] room = new char[N][N];
		
		for(int i=0; i<N; i++) {
			String input = sc.nextLine();
			for(int j=0; j<N; j++) {
				room[i][j]=input.charAt(j);
			}
		}
		
		System.out.println(countRow(N,room)+" "+countCol(N,room));
	}
	
	static int countRow(int N, char[][] room) {
		int result = 0;
		for(int i=0; i<N; i++) {
			int count=0;
			for(int j=0; j<N; j++) {
				if(room[i][j]=='.') {
					count++;
				}else {
					if(count>=2) {
						result++;
					}
					count=0;
				}
			}
			if(count>=2) {
				result++;
			}
		}
		return result;
	}
	
	static int countCol(int N, char[][] room) {
		int result = 0;
		for(int j=0; j<N; j++) {
			int count=0;
			for(int i=0; i<N; i++) {
				if(room[i][j]=='.') {
					count++;
				}else {
					if(count>=2) {
						result++;
					}
					count=0;
				}
			}
			if(count>=2) {
				result++;
			}
		}
		return result;
	}
}