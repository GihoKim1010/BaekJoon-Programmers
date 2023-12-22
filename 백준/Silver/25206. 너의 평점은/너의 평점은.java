import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 정수 N 입력
		double sum_grade = 0.0;
		double cal_score = 0.0;
		double sum_score = 0.0;

		// 학점 입력. 학점=grade, 과목평점=score
		while (sc.hasNext()) {
			String sub = sc.nextLine();
			String[] sp_sub = sub.split(" ");

			double grade=Double.parseDouble(sp_sub[1]);
			double score = 0.0;
			// 평점을 숫자로 치환. P일경우 -1로 지정.
			if (sp_sub[2].equals("A+")) {
				score = 4.5;
			} else if (sp_sub[2].equals("A0")) {
				score = 4.0;
			} else if (sp_sub[2].equals("B+")) {
				score = 3.5;
			} else if (sp_sub[2].equals("B0")) {
				score = 3.0;
			} else if (sp_sub[2].equals("C+")) {
				score = 2.5;
			} else if (sp_sub[2].equals("C0")) {
				score = 2.0;
			} else if (sp_sub[2].equals("D+")) {
				score = 1.5;
			} else if (sp_sub[2].equals("D0")) {
				score = 1.0;
			} else if (sp_sub[2].equals("F")) {
				score = 0.0;
			} else if (sp_sub[2].equals("P")) {
				score = -1.0;
			}



			// 평균을 내기 위한 sum_grade와 학점과 평점을 곱한 cal_score 및 그것을 다 합친 sum_score 계산
			if (score != -1) {		//P인경우 제외
				sum_grade = sum_grade + grade;
				cal_score = grade * score;
				sum_score = sum_score + cal_score;
			}
		}
		//출력
		System.out.println(sum_score/sum_grade);
	}
}