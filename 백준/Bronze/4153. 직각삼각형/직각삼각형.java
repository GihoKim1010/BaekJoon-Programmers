import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> result=new ArrayList<>();

		while (true) {

			int[] temp = new int[3];
			
			for(int i =0; i<3; i++) {
				temp[i]=sc.nextInt();
			}
			Arrays.sort(temp);

			if (temp[0] == 0 && temp[1] == 0 && temp[2] == 0) {
				break;
			}else if((temp[0]*temp[0])+(temp[1]*temp[1])==(temp[2]*temp[2])) {
				result.add("right");
			}else {
				result.add("wrong");
			}
		}
		for(String x:result) {
			System.out.println(x);
		}
	}
}