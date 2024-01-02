import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		int[] result = new int[N];

		for (int i = 0; i < N; i++) {
			String question = sc.nextLine();
			String[] ox=new String[question.length()];
			for (int j = 0; j < question.length(); j++) {
				char temp = question.charAt(j);
				ox[j]=String.valueOf(temp);
			}
			
			int score=0;
			int count=0;
			for(int j=0; j<ox.length; j++) {
				if(ox[j].equals("O")) {
					score++;
					count+=score;
				}else {
					score=0;
				}
			}
			result[i]=count;
		}
		for(int x:result) {
			System.out.println(x);
		}
	}
}