import java.util.Scanner;

public class Main {

	private static String[] gear;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		gear = new String[4];

		for (int i = 0; i < 4; i++) {
			gear[i] = sc.nextLine();
		}

		int K = sc.nextInt();

		for (int i = 0; i < K; i++) {
			int index = sc.nextInt()-1;
			int dir = sc.nextInt();


			if(index ==0) {
				gearRotationToRight(index,dir);
			}else if(index == 3) {
				gearRotationToLeft(index, dir);
			}else {
				gearRotationToLeft(index, dir);
				gear[index]=turnGear(gear[index], -dir);
				gearRotationToRight(index, dir);
			}
		}
		
		int answer = 0;
		
		for(int i=0; i<4; i++) {
			if(gear[i].charAt(0)=='1') {
				answer+=(int) Math.pow(2, i);
			}
		}
		System.out.println(answer);
		
	
	}

	// 맞닿은 부분이 같은지 확인
	public static boolean isSame(int leftIndex, int rightIndex) {
		if (gear[leftIndex].charAt(2) == gear[rightIndex].charAt(6)) {
			return true;
		} else {
			return false;
		}
	}

	// 기어 돌리기
	public static String turnGear(String gear, int dir) {

		// 시계방향
		if (dir == 1) {
			StringBuilder temp = new StringBuilder(String.valueOf(gear.charAt(7)));
			temp.append(gear.subSequence(0, 7));
			return temp.toString();

			// 반시계방향
		} else {
			StringBuilder temp = new StringBuilder(gear.substring(1, 8));
			temp.append(String.valueOf(gear.charAt(0)));
			return temp.toString();
		}
	}

	// 기준 톱니가 오른쪽이라 왼쪽 톱니에 영향을 주는경우
	public static void gearRotationToLeft(int index, int dir) {

		if (!isSame(index - 1, index)) {
			if (index - 1 > 0) {
				gearRotationToLeft(index - 1, -dir);
			} else {
				gear[index - 1] = turnGear(gear[index - 1], -dir);
			}
		}

		gear[index] = turnGear(gear[index], dir);
	}

	// 기준 톱니가 왼쪽이라 오른쪽 톱니에 영향을 주는경우
	public static void gearRotationToRight(int index, int dir) {

		if (!isSame(index, index + 1)) {
			if (index + 1 < 3) {
				gearRotationToRight(index + 1, -dir);
			} else {
				gear[index + 1] = turnGear(gear[index + 1], -dir);
			}
		}

		gear[index] = turnGear(gear[index], dir);
	}
}