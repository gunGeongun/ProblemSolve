import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");

        int n = Integer.parseInt(st[0]);
        int k = Integer.parseInt(st[1]);

        int[] arr = new int[n];
        for(int i = 0; i< n; i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        int count = 0;
        for(int i = arr.length - 1; i>=0 ;i--){
            if(k / arr[i] >= 1){
                count += (k/arr[i]) ;
                k = k % arr[i];
            }
        }

        System.out.println(count);
    }
}


