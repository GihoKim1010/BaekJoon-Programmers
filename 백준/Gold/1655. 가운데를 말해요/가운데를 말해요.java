import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static PriorityQueue<Integer> maxHeap, minHeap;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder result = new StringBuilder();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            maxHeap.add(a);

            if(maxHeap.size() > minHeap.size()+1) {
                minHeap.add(maxHeap.poll());
            }

            while(!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int temp = maxHeap.poll();
                maxHeap.add(minHeap.poll());
                minHeap.add(temp);
            }
            result.append(maxHeap.peek()).append("\n");
        }
        System.out.println(result.toString());
    }
}
