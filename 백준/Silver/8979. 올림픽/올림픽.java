import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(), k = sc.nextInt();
		ArrayList<int[]> grade = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int[] medalInfo = new int[4];
			medalInfo[0] = sc.nextInt();
			medalInfo[1] = sc.nextInt();
			medalInfo[2] = sc.nextInt();
			medalInfo[3] = sc.nextInt();
			grade.add(medalInfo);
		}
		Collections.sort(grade,
				Comparator.<int[], Integer>comparing(ar -> ar[1], Comparator.reverseOrder())
						.thenComparing(ar -> ar[2], Comparator.reverseOrder())
						.thenComparing(ar -> ar[3], Comparator.reverseOrder()));

		int order = 1, gold = 1000000, silver = 1000000, bronze = 1000000;
		for (int i = 0; i < n; i++) {
			if (grade.get(i)[1] < gold) {
				order = i+1;
				gold=grade.get(i)[1];
				silver=grade.get(i)[2];
				bronze=grade.get(i)[3];
			} else {
				if (grade.get(i)[2] < silver) {
					order = i+1;
					gold=grade.get(i)[1];
					silver=grade.get(i)[2];
					bronze=grade.get(i)[3];
				} else {
					if (grade.get(i)[3] < bronze) {
						order = i+1;
						gold=grade.get(i)[1];
						silver=grade.get(i)[2];
						bronze=grade.get(i)[3];
					}
				}
			}
			if (grade.get(i)[0] == k) {
				break;
			}
		}
		System.out.println(order);
	}
}