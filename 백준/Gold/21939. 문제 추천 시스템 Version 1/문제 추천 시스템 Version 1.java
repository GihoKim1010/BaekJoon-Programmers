import java.io.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class Main {

    static class Workbook {
        int num;
        int dif;

        public Workbook(int num, int dif){
            this.num = num;
            this.dif = dif;
        }
    }

    public static void main(String[] args) throws IOException {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        TreeSet<Workbook> ts = new TreeSet<>(Comparator.comparingInt((Workbook w) -> w.dif).thenComparingInt(w -> w.num));
        HashMap<Integer, Integer> hs = new HashMap<>();

        st.nextToken();
        int N = (int) st.nval;

        for(int i = 1; i <= N; i++) {
            st.nextToken();
            int P = (int) st.nval;
            st.nextToken();
            int L = (int) st.nval;

            Workbook newProblem = new Workbook(P, L);
            ts.add(newProblem);
            hs.put(P,L);
        }
        st.nextToken();
        int M = (int) st.nval;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<M; i++){
            st.nextToken();
            String order = st.sval;

            switch(order){
                case "recommend":
                    st.nextToken();
                    int x = (int) st.nval;

                    if(x==1){
                        sb.append(ts.last().num);
                    }else{
                        sb.append(ts.first().num);
                    }

                    if(i<M-1){
                        sb.append("\n");
                    }
                    break;

                case "add":
                    st.nextToken();
                    int P = (int) st.nval;
                    st.nextToken();
                    int L = (int) st.nval;
                    ts.add(new Workbook(P, L));
                    hs.put(P,L);
                    break;
                case "solved":
                    st.nextToken();
                    int Q = (int) st.nval;
                    int R = hs.get(Q);
                    Workbook removeWb = new Workbook(Q, R);
                    ts.remove(removeWb);
                    break;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}