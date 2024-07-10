import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pr = new PriorityQueue<>(Collections.reverseOrder());
        int result =0;
        for(int i =0;i<n;i++){
            int k = Integer.parseInt(br.readLine());
            pr.add(k);
        }

        for(int i= 0;i<n;i++){
            result = Math.max(result,pr.poll()*(i+1));
        }
        System.out.println(result);

    }

}
