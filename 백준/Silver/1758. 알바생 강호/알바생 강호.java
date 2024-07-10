import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());


        ArrayList<Long> arr = new ArrayList<>();

        for(int i =0;i<n;i++){
            arr.add(Long.parseLong(br.readLine()));
        }
        arr.sort(Collections.reverseOrder());

        long result = 0;
        for(int i=1;i<=n;i++){
            long num = arr.get(i-1) - (i-1);
            if(num <0){
                break;
            }
            result += num;

        }
        System.out.println(result);

    }

}
