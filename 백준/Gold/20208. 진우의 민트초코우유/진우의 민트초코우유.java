import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Location> mint;
	static Location home;
	static int N, M, H, max;
	static boolean[] visit;

	static class Location {
		int y;
		int x;

		public Location(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		H = sc.nextInt();
		mint = new ArrayList<>();
		max = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int temp = sc.nextInt();

				if (temp == 1) {
					home = new Location(i, j);
				} else if (temp == 2) {
					mint.add(new Location(i, j));
				}
			}
		}

		visit = new boolean[mint.size()];
		
		for(int i=0; i<visit.length; i++) {
			Location milk = mint.get(i);
			int distance = Math.abs(home.y-milk.y)+Math.abs(home.x-milk.x);
			
			if(distance <= M) {
				drinkMilk(milk, i, M-distance+H,1);
			}
		}
		System.out.println(max);
	}

	static void drinkMilk(Location now, int index, int hp, int count) {
		visit[index] = true;

		for (int i = 0; i < visit.length; i++) {
			if (!visit[i]) {
				Location milk = mint.get(i);
				int distance = Math.abs(now.y - milk.y) + Math.abs(now.x - milk.x);

				if (distance <= hp) {
					drinkMilk(milk, i, hp - distance + H, count + 1);
				}
			}
		}

		int goHome = Math.abs(now.y - home.y) + Math.abs(now.x - home.x);

		if (goHome <= hp) {
			max = Math.max(count, max);
		}

		visit[index] = false;
	}
}