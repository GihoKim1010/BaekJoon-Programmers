import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<int[]> homeworks = new ArrayList<>();

		int maxDay = 0;
		for (int i = 0; i < n; i++) {
			int[] toDo = new int[2];
			toDo[0] = sc.nextInt();
			toDo[1] = sc.nextInt();
			maxDay = Math.max(maxDay, toDo[0]);
			homeworks.add(toDo);
		}
		Collections.sort(homeworks, Comparator.<int[], Integer>comparing(ar -> ar[1]).thenComparing(ar -> ar[0]));

		int sum = 0;
		int[] check = new int[maxDay+1];
		for (int i = n - 1; i >= 0; i--) {
			for(int j=homeworks.get(i)[0]; j>0; j--) {
				if(check[j]==0) {
					check[j]=homeworks.get(i)[1];
					break;
				}
			}
		}
		
		for(int x : check) {
			sum+=x;
		}
		System.out.println(sum);
	}
}