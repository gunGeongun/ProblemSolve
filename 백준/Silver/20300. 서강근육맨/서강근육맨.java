import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Long> arr = new ArrayList<>();
        String[] st = br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr.add(Long.parseLong(st[i]));
        }
        Collections.sort(arr);

        long result = 0;
        if(n%2==0){
            for(int i=0;i<(n/2);i++){
                result = Math.max(result,arr.get(i)+arr.get(n-i-1));
            }
        }
        else{
            result = arr.get(n-1);
            for(int i=0;i<((n-1)/2);i++){
                result = Math.max(result,arr.get(i)+arr.get(n-i-2));
            }
        }
        System.out.println(result);

    }

}
