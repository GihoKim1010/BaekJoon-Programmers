import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] height = new int[9];
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			height[i] = sc.nextInt();
			sum += height[i];
		}
		int over = sum - 100;
		loop_a: for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (height[i] + height[j] == over) {
					height[i] = 0;
					height[j] = 0;
					break loop_a;
				}
			}
		}
		Arrays.sort(height);
		StringBuilder result = new StringBuilder();
		for (int i = 2; i < 9; i++) {
			result.append(height[i] + "\n");
		}
		System.out.println(result.toString());
	}
}