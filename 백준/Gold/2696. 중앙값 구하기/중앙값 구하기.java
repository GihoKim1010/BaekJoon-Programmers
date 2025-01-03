import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        st.nextToken();
        int T = (int) st.nval;

        for(int i=0; i<T; i++) {
            st.nextToken();
            int M = (int) st.nval;

            result.append(M/2+1).append("\n");

            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
            int countTen =0;

            for(int j=1; j<=M; j++) {
                st.nextToken();
                int num = (int) st.nval;
                maxHeap.add(num);

                if(j==1){
                    result.append(num).append(" ");
                }else{

                    while(true){
                        if(maxHeap.size()>minHeap.size()){
                            minHeap.add(maxHeap.poll());
                        }

                        if(maxHeap.peek() <= minHeap.peek()){
                            if(j%2==1) {
                                result.append(minHeap.peek());
                            }
                            break;
                        }else{
                            maxHeap.add(minHeap.poll());
                            minHeap.add(maxHeap.poll());
                        }
                    }

                    if(j%2==1) {
                        if ((j - countTen) / 19 == 1) {
                            countTen += 20;
                            result.append("\n");
                        } else {
                            result.append(" ");
                        }
                    }
                }
                if(j==M && j%10 !=0){
                    result.append("\n");
                }
            }
        }

        bw.write(result.toString());
        bw.flush();
    }
}