import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> largerQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> smallerQ = new PriorityQueue<>();
        arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int oneCount  = 0;
        int zeroCount = 0;
        int result= 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                zeroCount++;
            }
            else if(arr[i] == 1) {
                oneCount++;
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i]>1){
                largerQ.add(arr[i]);
            }
            else if (arr[i] < 0){
                smallerQ.add(arr[i]);
            }
        }

        while(largerQ.size() > 2){
            int a = largerQ.poll();
            int b=  largerQ.poll();

            int lsum = a*b;

            result += lsum;
        }

        while(!largerQ.isEmpty()){
            if(largerQ.size() == 2){
                result += (largerQ.poll() * largerQ.poll());
            }
            else{
                result += largerQ.poll();
            }

        }

        while(smallerQ.size() > 2){
            int a = smallerQ.poll();
            int b=  smallerQ.poll();

            int ssum= a*b;

            result += ssum;
        }
        while(!smallerQ.isEmpty()){
            if(smallerQ.size() == 2){
                result += (smallerQ.poll() * smallerQ.poll());
            }
            else{
                if(zeroCount == 0){
                    result += smallerQ.poll();
                }
                else{
                    result += (smallerQ.poll() * 0);
                }
            }

        }
        System.out.println(result + oneCount);
    }
}