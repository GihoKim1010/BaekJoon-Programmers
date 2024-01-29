import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static boolean isDirty(int[][] room, int i, int j) {
		if (room[i - 1][j] != 0 && room[i][j - 1] != 0 && room[i + 1][j] != 0 && room[i][j + 1] != 0) {
			return false;
		} else {
			return true;
		}
	}

	static int turn(int k) {
		if (k >= 1 && k <= 3) {
			return k - 1;
		} else {
			return 3;
		}
	}

	static int[] goBack(int i, int j, int c) {
		int[] result = { i, j };
		if (c == 0) {
			result[0] = i + 1;
		} else if (c == 1) {
			result[1] = j - 1;
		} else if (c == 2) {
			result[0] = i - 1;
		} else {
			result[1] = j + 1;
		}
		return result;
	}

	static boolean canBack(int[][] room, int i, int j, int c, int N, int M) {
		boolean judge = false;
		if (c == 0) {
			if (i + 1 != N && room[i + 1][j] != 1) {
				judge = true;
			}
		} else if (c == 1) {
			if (j - 1 != -1 && room[i][j - 1] != 1) {
				judge = true;
			}
		} else if (c == 2) {
			if (i - 1 != -1 && room[i - 1][j] != 1) {
				judge = true;
			}
		} else {
			if (j + 1 != M && room[i][j + 1] != 1) {
				judge = true;
			}
		}
		return judge;
	}

	static int[] goFront(int[][] room, int i, int j, int c, int N, int M) {
		int[] result = { i, j };

		if (c == 0) {
			if (i - 1 != -1 && room[i - 1][j] == 0) {
				result[0] = i - 1;
			}
		} else if (c == 1) {
			if (j + 1 != M && room[i][j + 1] == 0) {
				result[1] = j + 1;
			}
		} else if (c == 2) {
			if (i + 1 != N && room[i + 1][j] == 0) {
				result[0] = i + 1;
			}
		} else {
			if (j - 1 != -1 && room[i][j - 1] == 0) {
				result[1] = j - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String firstLine = br.readLine();
		String[] temp = firstLine.split(" ");
		int N = Integer.parseInt(temp[0]); // 방 세로길이
		int M = Integer.parseInt(temp[1]); // 방 가로길이

		String secondLine = br.readLine();
		String[] temp1 = secondLine.split(" ");
		int r = Integer.parseInt(temp1[0]); // 청소기의 초기 세로 위치
		int c = Integer.parseInt(temp1[1]); // 청소기의 초기 가로 위치
		int d = Integer.parseInt(temp1[2]); // 청소기의 초기 방향 0~3 : 북동남서

		int[][] room = new int[N][M]; // 방상태 저장. 0:더러운곳, 1:벽

		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			String[] temp2 = input.split(" ");
			for (int j = 0; j < M; j++) {
				room[i][j] = Integer.parseInt(temp2[j]);
			}
		}

		int count = 0;
		while (true) {
			if (room[r][c] == 0) {
				room[r][c] = -1;
				count++;
			} else if (!isDirty(room, r, c)) { // 네방향 다 깨끗함
				if (canBack(room, r, c, d, N, M)) { // 뒤로 갈 수 있을 경우
					r = goBack(r, c, d)[0];
					c = goBack(r, c, d)[1];
				} else { // 후진을 못할 경우
					break;
				}
			} else { // 어딘가 더러움
				d = turn(d); // 반시계로 돌림
				r = goFront(room, r, c, d, N, M)[0];
				c = goFront(room, r, c, d, N, M)[1];
			}
		}

		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}

}