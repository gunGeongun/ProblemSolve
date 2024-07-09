import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] st = br.readLine().split(" ");
            for(int j =0;j<st.length;j++){
                pr.add(Integer.parseInt(st[j]));
            }
        }
        int result = 0;
        for(int i=0;i<n;i++){
            result = pr.poll();
        }
        System.out.println(result);

    }
}
