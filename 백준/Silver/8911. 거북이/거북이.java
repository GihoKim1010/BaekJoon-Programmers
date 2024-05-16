import java.util.Scanner;

public class Main {

	static boolean[][] board;
	static int[][] dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};
	static int dirNum;
	static int[] location;
	static int left, right, up, down;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		int T=sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<T; i++) {
			location = new int[] {0,0};
			left=0; right=0; up=0; down=0;
			dirNum=0;
			String input = sc.nextLine();
			
			for(int j=0; j<input.length(); j++) {
				move(input.charAt(j));
			}
			
			int size = (right-left)*(down-up);
			result.append(size).append("\n");
		}
		
		System.out.println(result.toString());
	}

	//이동만 구현함. 이동마다 최소 / 최댓값 봐서 가로 세로 지정
	static void move(char order) {
		switch (order) {
		case 'F':
			location[0] +=dir[dirNum][0];
			location[1] +=dir[dirNum][1];
			break;
		case 'B':
			location[0] -=dir[dirNum][0];
			location[1] -=dir[dirNum][1];
			break;
		case 'L':
			dirNum=(dirNum+3)%4;
			break;
		case 'R':
			dirNum=(dirNum+1)%4;
			break;
		}
		
		up=Math.min(up, location[0]);
		down=Math.max(down, location[0]);
		left=Math.min(left, location[1]);
		right=Math.max(right, location[1]);
	}
}