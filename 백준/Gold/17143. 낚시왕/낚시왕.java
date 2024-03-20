import java.util.Scanner;

public class Main {

	public static class Shark {

		int speed;
		int dir;
		int size;

		Shark(int speed, int dir, int size) {
			this.speed = speed;
			this.dir = dir;
			this.size = size;
		}
	}

	static Shark[][] sea;
	static int r, c, m, sum;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		r = sc.nextInt();
		c = sc.nextInt();
		m = sc.nextInt();
		sea = new Shark[r][c];
		sum = 0;

		for (int i = 0; i < m; i++) {
			// 원래 y,x좌표, 속력, 이동방향(1~4:상하우좌순), 크기.
			int y = sc.nextInt()-1, x = sc.nextInt()-1, s = sc.nextInt(), d = sc.nextInt(), z = sc.nextInt();
			Shark shark = new Shark(s, d, z);
			sea[y][x] = shark;
		}

		for (int i = 0; i < c; i++) {
			fishing(i);
			moving();
		}
		System.out.println(sum);
	}

	// 같은 열에있는 상어를 낚음
	static void fishing(int x) {
		for (int i = 0; i < r; i++) {
			if (sea[i][x] != null) {
				sum += sea[i][x].size;
				sea[i][x] = null;
				break;
			}
		}
	}

	// 상어의 이동을 구현. 전부 이동 후 같은 칸일경우 크기가 큰 상어만 남기고, 결과를 sea 배열에 복사.
	static void moving() {

		Shark[][] tempSea = new Shark[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (sea[i][j] != null) {
					int newY = 0, newX = 0;
					switch (sea[i][j].dir) {
					case 1:
						newY = i - sea[i][j].speed;
						newX = j;
						break;
					case 2:
						newY = i + sea[i][j].speed;
						newX = j;
						break;
					case 3:
						newY = i;
						newX = j + sea[i][j].speed;
						break;
					case 4:
						newY = i;
						newX = j - sea[i][j].speed;
						break;
					}

					while (newY < 0|| newY >= r) {
						if (newY < 0) {
							newY *= -1;
							sea[i][j].dir=2;
						} else if (newY >= r) {
							newY = 2 * r - newY - 2;
							sea[i][j].dir=1;
						}
					}

					while (newX < 0 || newX >= c) {
						if (newX < 0) {
							newX *= -1;
							sea[i][j].dir=3;
						} else if (newX >= c) {
							newX = 2 * c - newX - 2;
							sea[i][j].dir=4;
						}
					}

					if (tempSea[newY][newX] != null && tempSea[newY][newX].size < sea[i][j].size) {
						tempSea[newY][newX] = sea[i][j];
					}else if (tempSea[newY][newX]==null) {
						tempSea[newY][newX] = sea[i][j];
					}
				}
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sea[i][j] = tempSea[i][j];
			}
		}
	}
}