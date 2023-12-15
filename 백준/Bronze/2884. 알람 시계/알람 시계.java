import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String givenTime=sc.nextLine();
		String[] sTime = givenTime.split(" ");
		int[] iTime = new int[sTime.length];
		
		for(int i=0; i<sTime.length; i++) {
			iTime[i] = Integer.parseInt(sTime[i]);
		}
		
		int H=iTime[0];
		int M=iTime[1];
		int resultH;
		int resultM;

		if (M >= 45) {
			resultH = H;
			resultM = M - 45;
			System.out.println(resultH+" "+resultM);
		} else if (H > 0 && M < 45) {
			resultH = H - 1;
			resultM = M + 15;
			System.out.println(resultH+" "+resultM);
		} else if (H == 0 && M < 45) {
			resultH = H + 23;
			resultM = M + 15;
			System.out.println(resultH+" "+resultM);
		}
	}
}