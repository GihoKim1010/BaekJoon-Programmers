import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<3; i++) {
			int[] temp = new int[4];
			
			for(int j=0; j<4; j++) {
				temp[j]=sc.nextInt();
			}
			
			Arrays.sort(temp);
			
			if(temp[0]==1) {
				result.append("E").append("\n");
			}else if(temp[1]==1) {
				result.append("A").append("\n");
			}else if(temp[2]==1) {
				result.append("B").append("\n");
			}else if(temp[3]==1) {
				result.append("C").append("\n");
			}else {
				result.append("D").append("\n");
			}
			
		}
		System.out.println(result.toString());
	}
}