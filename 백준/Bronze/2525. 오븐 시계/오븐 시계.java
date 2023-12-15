import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nowTime = sc.nextLine();
		int M2 = sc.nextInt();

		String[] sTime = nowTime.split(" ");
		int[] iTime = new int[sTime.length];

		for (int i = 0; i < sTime.length; i++) {
			iTime[i] = Integer.parseInt(sTime[i]);
		}

		int H = iTime[0];
		int M1 = iTime[1];
		int M = M1 + M2;

		int resultH;
		int resultM;

		if (M >= 60) {
			resultH = H + (M / 60);
			resultM = M % 60;
			if(resultH>23) {
				resultH=resultH-24;
				System.out.println(resultH+" "+resultM);
			}else {
				System.out.println(resultH+" "+resultM);
			}
		}else if(M<=60) {
			resultH = H;
			resultM = M;
			System.out.println(resultH+" "+resultM);
		}
		
	}
}