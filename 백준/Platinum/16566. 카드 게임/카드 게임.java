import java.io.*;
import java.util.Arrays;

public class Main {

    static int[] cards;
    static int[] arr;

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        String[] firstLine = br.readLine().split(" ");
        String[] secondLine = br.readLine().split(" ");
        String[] thirdLine = br.readLine().split(" ");

        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        int K = Integer.parseInt(firstLine[2]);

        cards = Arrays.stream(secondLine).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(cards);
        arr = new int[M+1];
        for(int i = 1; i <= M; i++) {
            arr[i] = i;
        }

        for(int i = 0; i < K; i++) {
            int nextCard = Integer.parseInt(thirdLine[i]);
            int index = binarySearch(cards, nextCard);
            index = findCard(index);
            result.append(cards[index]).append("\n");
            union(index);
        }

        System.out.println(result.toString());
    }

    static int binarySearch(int[] cards, int target) {
        int low = 0;
        int high = cards.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (cards[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int findCard(int index) {
        if(arr[index] == index) {
            return index;
        }
        return arr[index] = findCard(arr[index]);
    }

    static void union(int index){
        int left = findCard(index);
        int right = findCard(index+1);
        if(left>right){
            arr[right] = left;
        }else if(left<right){
            arr[left] = right;
        }
    }
}