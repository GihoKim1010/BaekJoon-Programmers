import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {

        StreamTokenizer st = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();

        st.nextToken();
        int N = (int) st.nval;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0; i<N; i++) {
            st.nextToken();
            int num = (int) st.nval;
            minHeap.add(num);

            if(i==0){
                result.append(num);
            }else if(i==1){
                maxHeap.add(minHeap.poll());
                result.append(maxHeap.peek());
            }else {
                while (true) {
                    if (minHeap.size() > maxHeap.size()) {
                        maxHeap.add(minHeap.poll());
                    }

                    if (maxHeap.peek() <= minHeap.peek()) {
                        result.append(maxHeap.peek());
                        break;
                    } else {
                        maxHeap.add(minHeap.poll());
                        minHeap.add(maxHeap.poll());
                    }
                }
            }
            result.append('\n');
        }

        bw.write(result.toString());
        bw.flush();
    }
}