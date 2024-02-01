import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static int turn(int d, String C) {
		if (C.equals("L")) {
			return (d + 3) % 4;
		} else {
			return (d + 1) % 4;
		}
	}

	public static int front(int[][] board, Deque<int[]> snake, int d, int time, int N, int count, int[] now) {
		if (d == 0) {
			for (int i = 0; i < time; i++) {
				now[1]++;
				count++;
				if (now[1] == N || meetbody(now, snake)) {
					now[0] = -10; // 벽을 만나 게임이 끝난경우.
					break;
				}
				snake.addFirst(now.clone());
				if (board[now[0]][now[1]] != 1) {
					snake.pollLast();
				}else {
					board[now[0]][now[1]]=0;
				}
			}
		} else if (d == 1) {
			for (int i = 0; i < time; i++) {
				now[0]++;
				count++;
				if (now[0] == N || meetbody(now, snake)) {
					now[0] = -10; // 벽을 만나 게임이 끝난경우.
					break;
				}
				snake.addFirst(now.clone());
				if (board[now[0]][now[1]] != 1) {
					snake.pollLast();
				}else {
					board[now[0]][now[1]]=0;
				}
			}
		} else if (d == 2) {
			for (int i = 0; i < time; i++) {
				now[1]--;
				count++;
				if (now[1] == -1 || meetbody(now, snake)) {
					now[0] = -10; // 벽을 만나 게임이 끝난경우.
					break;
				}
				snake.addFirst(now.clone());
				if (board[now[0]][now[1]] != 1) {
					snake.pollLast();
				}else {
					board[now[0]][now[1]]=0;
				}
			}
		} else {
			for (int i = 0; i < time; i++) {
				now[0]--;
				count++;
				if (now[0] == -1 || meetbody(now, snake)) {
					now[0] = -10; // 벽을 만나 게임이 끝난경우.
					break;
				}
				snake.addFirst(now.clone());
				if (board[now[0]][now[1]] != 1) {
					snake.pollLast();
				}else {
					board[now[0]][now[1]]=0;
				}
			}
		}
		return count;
	}
	public static boolean meetbody(int[] now, Deque<int[]> snake) {
		for (int[] x : snake) {
	        if (x[0] == now[0] && x[1] == now[1]) {
	            return true;
	        }
	    }
		return false;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int d = 0; // 동,남,서,북 순으로 0,1,2,3지정.
		int[][] board = new int[N][N]; // 사과가 있는 위치에 1 저장예정.

		for (int i = 0; i < K; i++) {
			String input = br.readLine();
			String[] sp = input.split(" ");
			board[Integer.parseInt(sp[0]) - 1][Integer.parseInt(sp[1]) - 1] = 1;
		}

		int L = Integer.parseInt(br.readLine());
		Queue<String[]> order = new LinkedList<>(); // 회전 명령 저장
		for (int i = 0; i < L; i++) {
			String input = br.readLine();
			String[] temp = input.split(" ");
			order.add(temp);
		}

		Deque<int[]> snake = new LinkedList<>(); // 뱀의 몸이 차지한 위치들
		int[] startpoint = { 0, 0 };
		snake.addFirst(startpoint);
		int count = 0;
		int[] now = new int[2];
		for (int i = 0; i < L; i++) {
			String[] temp = order.poll();
			int when = Integer.parseInt(temp[0]);
			String C = temp[1];
			now = snake.peekFirst().clone();
			count = front(board, snake, d, when - count, N, count, now);
			if (now[0] == -10) {
				break;
			}
			d = turn(d, C);
		}
		if (now[0] != -10) {
			count = front(board, snake, d, 10101 - count, N, count, now); // 마지막으로 더 갈 수 있는경우
		}
		bw.write(String.valueOf(count));
		bw.newLine();
		bw.flush();
		br.close();
		bw.close();
	}
}