import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] sp = input.split(":");
		StringBuilder answer = new StringBuilder();

		// 부족한 칸 수를 알아낼 변수
		int deficiency = 8;
		for (int i = 0; i < sp.length; i++) {
			if (!sp[i].equals("")) {
				deficiency--;
			}
		}

		// ":" 를 기준으로 나눴기 때문에, :: 가 나오면 공백이 두번생김. 이를 해결하기위한 boolean.
		boolean judge = true;
		for (int i = 0; i < sp.length; i++) {
			String now = sp[i];

			if (now.equals("") && judge) {
				for (int j = 0; j < deficiency; j++) {
					answer.append("0000:");
					judge = false;
				}

			} else if (now.equals("") && !judge) {
				continue;
			} else {
				for (int j = 0; j < 4 - now.length(); j++) {
					answer.append("0");
				}
				answer.append(now + ":");
			}
		}
		answer.deleteCharAt(answer.length()-1);
		
		//끝에 :: 가 나오는 경우를 처리
		if(answer.length()<39) {
			while(answer.length()!=39) {
				answer.append(":0000");
			}
		}
		System.out.println(answer.toString());
	}
}