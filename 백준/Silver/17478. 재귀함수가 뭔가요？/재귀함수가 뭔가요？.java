import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static String line(int N) {
		StringBuilder temp = new StringBuilder();

		if (N == 0) {
			return "";
		} else if (N == 1) {
			temp.append("____");
		} else {
			temp.append(line(N - 1)).append("____");
		}
		return temp.toString();
	}

	public static String theLong(int N) {
		StringBuilder temp = new StringBuilder();

		if (N == 1) {
			temp.append("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.").append("\n");
			temp.append("\"재귀함수가 뭔가요?\"").append("\n");
			temp.append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
			temp.append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
			temp.append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
		} else {
			temp.append(theLong(N-1));
			temp.append(line(N-1)).append("\"재귀함수가 뭔가요?\"").append("\n");
			temp.append(line(N-1)).append("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.").append("\n");
			temp.append(line(N-1)).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.").append("\n");
			temp.append(line(N-1)).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"").append("\n");
		}
		
		return temp.toString();
	}
	
	public static String answer(int N) {
		StringBuilder temp = new StringBuilder();
		
		temp.append(line(N)).append("\"재귀함수가 뭔가요?\"").append("\n");
		temp.append(line(N)).append("\"재귀함수는 자기 자신을 호출하는 함수라네\"").append("\n");
		temp.append(line(N)).append("라고 답변하였지.").append("\n");
		
		return temp.toString();
	}
	
	public static String last(int N) {
		StringBuilder sb = new StringBuilder();
		
		if(N==1) {
			sb.append("라고 답변하였지.").append("\n");
		}else {
			sb.append(line(N-1)).append("라고 답변하였지.").append("\n").append(last(N-1));
		}
		return sb.toString();
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(theLong(N));
		bw.write(answer(N));
		bw.write(last(N));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
}