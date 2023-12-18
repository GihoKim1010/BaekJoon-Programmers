import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while (sc.hasNext()){
				String x = sc.nextLine();
				String[] y = x.split(" ");
				int[] z = new int[y.length];

				for (int j = 0; j < y.length; j++) {
					z[j] = Integer.parseInt(y[j]);
				}
				System.out.println(z[0]+z[1]);
				}
		}
	}