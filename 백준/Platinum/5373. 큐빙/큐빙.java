import java.util.Scanner;

public class Main {

	static String[][] cube;
	static String[][] originCube = { { "x", "x", "x", "w", "w", "w", "x", "x", "x" },
			{ "x", "x", "x", "w", "w", "w", "x", "x", "x" }, { "x", "x", "x", "w", "w", "w", "x", "x", "x" },
			{ "g", "g", "g", "r", "r", "r", "b", "b", "b" }, { "g", "g", "g", "r", "r", "r", "b", "b", "b" },
			{ "g", "g", "g", "r", "r", "r", "b", "b", "b" }, { "x", "x", "x", "y", "y", "y", "x", "x", "x" },
			{ "x", "x", "x", "y", "y", "y", "x", "x", "x" }, { "x", "x", "x", "y", "y", "y", "x", "x", "x" },
			{ "x", "x", "x", "o", "o", "o", "x", "x", "x" }, { "x", "x", "x", "o", "o", "o", "x", "x", "x" },
			{ "x", "x", "x", "o", "o", "o", "x", "x", "x" } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		StringBuilder answer = new StringBuilder();
		
		for (int i = 0; i < t; i++) {
			cube = resetCube();

			int n = sc.nextInt();
			sc.nextLine();
			String input = sc.nextLine();
			String[] orders = input.split(" ");

			for (int j = 0; j < n; j++) {
				String side = String.valueOf(orders[j].charAt(0));
				String plusMinus = String.valueOf(orders[j].charAt(1));
				turn(side, plusMinus);
			}
			
			for (int k = 0; k < 3; k++) {
				for (int l = 3; l < 6; l++) {
					answer.append(cube[k][l]);
				}
				answer.append("\n");
			}

		}

		System.out.println(answer.toString());

	}

	// 새로운 테스트 케이스를 위한 큐브 초기화
	static String[][] resetCube() {
		String[][] tempCube = new String[12][9];

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 9; j++) {
				tempCube[i][j] = originCube[i][j];
			}
		}
		return tempCube;
	}

	// 아래 두 메서드(시계, 반시계)의 좌표를 구하기 위한 메서드
	static int[] findXY(String side, String plusMinus) {
		int y = 0, x = 0;
		switch (side) {
		case "U":
			y = 0;
			x = 3;
			break;
		case "F":
			y = 3;
			x = 3;
			break;
		case "L":
			y = 3;
			x = 0;
			break;
		case "R":
			y = 3;
			x = 6;
			break;
		case "D":
			y = 6;
			x = 3;
			break;
		case "B":
			y = 9;
			x = 3;
			break;
		}
		return new int[] { y, x };
	}

	// 돌릴 면을 시계방향으로 돌림
	static void turn(String side, String plusMinus) {
		int y = findXY(side, plusMinus)[0];
		int x = findXY(side, plusMinus)[1];

		if(plusMinus.equals("+")) {
			String temp = cube[0 + y][0 + x];
			cube[0 + y][0 + x] = cube[2 + y][0 + x];
			cube[2 + y][0 + x] = cube[2 + y][2 + x];
			cube[2 + y][2 + x] = cube[0 + y][2 + x];
			cube[0 + y][2 + x] = temp;

			temp = cube[0 + y][1 + x];
			cube[0 + y][1 + x] = cube[1 + y][0 + x];
			cube[1 + y][0 + x] = cube[2 + y][1 + x];
			cube[2 + y][1 + x] = cube[1 + y][2 + x];
			cube[1 + y][2 + x] = temp;
		}else if(plusMinus.equals("-")) {
			String temp = cube[0 + y][0 + x];
			cube[0 + y][0 + x] = cube[0 + y][2 + x];
			cube[0 + y][2 + x] = cube[2 + y][2 + x];
			cube[2 + y][2 + x] = cube[2 + y][0 + x];
			cube[2 + y][0 + x] = temp;

			temp = cube[0 + y][1 + x];
			cube[0 + y][1 + x] = cube[1 + y][2 + x];
			cube[1 + y][2 + x] = cube[2 + y][1 + x];
			cube[2 + y][1 + x] = cube[1 + y][0 + x];
			cube[1 + y][0 + x] = temp;
		}
		
		if (side.equals("U") && plusMinus.equals("+")) {
			String[] temp = { cube[3][0], cube[3][1], cube[3][2] };
			for (int i = 0; i < 3; i++) {
				cube[3][i] = cube[3][3 + i];
				cube[3][3 + i] = cube[3][6 + i];
				cube[3][6 + i] = cube[11][5 - i];
				cube[11][5 - i] = temp[i];
			}
		}else if(side.equals("U") && plusMinus.equals("-")) {
			String[] temp = { cube[3][6], cube[3][7], cube[3][8] };
			for (int i = 0; i < 3; i++) {
				cube[3][6 + i] = cube[3][3 + i];
				cube[3][3 + i] = cube[3][i];
				cube[3][i] = cube[11][5 - i];
				cube[11][5 - i] = temp[i];
			}
		}else if(side.equals("D") && plusMinus.equals("+")) {
			String[] temp = { cube[5][6], cube[5][7], cube[5][8] };
			for (int i = 0; i < 3; i++) {
				cube[5][6 + i] = cube[5][3 + i];
				cube[5][3 + i] = cube[5][i];
				cube[5][i] = cube[9][5 - i];
				cube[9][5 - i] = temp[i];
			}
		}else if(side.equals("D") && plusMinus.equals("-")) {
			String[] temp = { cube[5][0], cube[5][1], cube[5][2] };
			for (int i = 0; i < 3; i++) {
				cube[5][i] = cube[5][3 + i];
				cube[5][3 + i] = cube[5][6 + i];
				cube[5][6 + i] = cube[9][5 - i];
				cube[9][5 - i] = temp[i];
			}
		}else if(side.equals("F") && plusMinus.equals("+")) {
			String[] temp = { cube[2][3], cube[2][4], cube[2][5] };
			for (int i = 0; i < 3; i++) {
				cube[2][3+i] = cube[5 - i][2];
				cube[5 - i][2] = cube[6][5 - i];
				cube[6][5 - i] = cube[3 + i][6];
				cube[3 + i][6] = temp[i];
			}
		}else if(side.equals("F") && plusMinus.equals("-")) {
			String[] temp = { cube[2][3], cube[2][4], cube[2][5] };
			for (int i = 0; i < 3; i++) {
				cube[2][3+i] = cube[3 + i][6];
				cube[3 + i][6] = cube[6][5 - i];
				cube[6][5 - i] = cube[5 - i][2];
				cube[5 - i][2] = temp[i];
			}
		}else if(side.equals("B") && plusMinus.equals("+")) {
			String[] temp = { cube[0][3], cube[0][4], cube[0][5] };
			for (int i = 0; i < 3; i++) {
				cube[0][3 + i] = cube[3 + i][8];
				cube[3 + i][8] = cube[8][5 - i];
				cube[8][5 - i] = cube[5 - i][0];
				cube[5 - i][0] = temp[i];
			}
		}else if(side.equals("B") && plusMinus.equals("-")) {
			String[] temp = { cube[0][3], cube[0][4], cube[0][5] };
			for (int i = 0; i < 3; i++) {
				cube[0][3 + i] = cube[5 - i][0];
				cube[5 - i][0] = cube[8][5 - i];
				cube[8][5 - i] = cube[3 + i][8];
				cube[3 + i][8] = temp[i];
			}
		}else if(side.equals("L") && plusMinus.equals("+")) {
			String[] temp = { cube[9][3], cube[10][3], cube[11][3] };
			for (int i = 0; i < 3; i++) {
				cube[9 + i][3] = cube[6 + i][3];
				cube[6 + i][3] = cube[3 + i][3];
				cube[3 + i][3] = cube[i][3];
				cube[i][3] = temp[i];
			}
		}else if(side.equals("L") && plusMinus.equals("-")) {
			String[] temp = { cube[0][3], cube[1][3], cube[2][3] };
			for (int i = 0; i < 3; i++) {
				cube[i][3] = cube[3 + i][3];
				cube[3 + i][3] = cube[6 + i][3];
				cube[6 + i][3] = cube[9 + i][3];
				cube[9 + i][3] = temp[i];
			}
		}else if(side.equals("R") && plusMinus.equals("+")) {
			String[] temp = { cube[0][5], cube[1][5], cube[2][5] };
			for (int i = 0; i < 3; i++) {
				cube[i][5] = cube[3 + i][5];
				cube[3 + i][5] = cube[6 + i][5];
				cube[6 + i][5] = cube[9 + i][5];
				cube[9 + i][5] = temp[i];
			}
		}else if(side.equals("R") && plusMinus.equals("-")) {
			String[] temp = { cube[9][5], cube[10][5], cube[11][5] };
			for (int i = 0; i < 3; i++) {
				cube[9 + i][5] = cube[6 + i][5];
				cube[6 + i][5] = cube[3 + i][5];
				cube[3 + i][5] = cube[i][5];
				cube[i][5] = temp[i];
			}
		}
	}
}