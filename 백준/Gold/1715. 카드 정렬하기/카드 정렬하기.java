import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int sum = 0;
        for(int i =0;i<n;i++){
            queue.add(Integer.parseInt(br.readLine()));
        }

        while(queue.size() != 1){
                int first = queue.poll();
                int second = queue.poll();

                int tmp = first + second;
                sum += (tmp);

                queue.add(tmp);
            }
        System.out.println(sum);
    }
}


