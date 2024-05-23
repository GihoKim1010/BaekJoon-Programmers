import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] S = new String[n];
        StringBuilder makeT = new StringBuilder();

        for (int i = 0; i < n; i++) {
            S[i] = br.readLine();
        }

        int left = 0;
        int right = n - 1;
        while (left < right) {

            char leftChar = S[left].charAt(0);
            char rightChar = S[right].charAt(0);
            if (leftChar == rightChar) {
                //양쪽끝이 같은경우 안쪽으로 하나씩 보내며 비교
                int leftNext = left + 1;
                int rightNext = right - 1;

                while (true) {
                    char leftNextChar = S[leftNext].charAt(0);
                    char rightNextChar = S[rightNext].charAt(0);
                    if (leftNextChar > rightNextChar) {
                        makeT.append(S[right]);
                        right--;
                        break;
                    } else if (rightNextChar > leftNextChar) {
                        makeT.append(S[left]);
                        left++;
                        break;
                    } else {
                        leftNext++;
                        rightNext--;
                    }

                    //남은 문자를 다 검사했는데, 다 같은 문자인경우. 나머지를 다 답에 추가 후 바깥 while문 탈출시킴
                    if (leftNext > rightNext) {
                        for (int j = left; j <= right; j++) {
                            makeT.append(S[j]);
                        }
                        left = right + 1;
                        break;
                    }
                }


            } else if (leftChar > rightChar) {
                makeT.append(S[right]);
                right--;
            } else {
                makeT.append(S[left]);
                left++;
            }
        }

        //남은 문자 하나 추가
        if (left == right) {
            makeT.append(S[left]);
        }

        String T = makeT.toString();
        StringBuilder result = new StringBuilder();
        int cut = T.length() / 80;
        for (int i = 0; i < cut; i++) {
            result.append(T.substring(80 * i, 80 * (i + 1))).append("\n");
        }

        result.append(T.substring(cut*80));

        bw.write(result.toString());
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
    }
}