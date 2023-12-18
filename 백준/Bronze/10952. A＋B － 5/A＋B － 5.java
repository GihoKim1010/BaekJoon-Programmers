import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while (true){
				String x = sc.nextLine();
				String[] y = x.split(" ");
				int[] z = new int[y.length];

				for (int j = 0; j < y.length; j++) {
					z[j] = Integer.parseInt(y[j]);
				}
				if (z[0]==0 && z[1]==0) {
					break;
				}else {
				System.out.println(z[0]+z[1]);
				}
			}
			sc.close();
		}
	}