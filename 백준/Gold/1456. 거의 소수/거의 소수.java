import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        long m = Long.parseLong(st[0]);
        long n = Long.parseLong(st[1]);

        long[] arr = new long[10000001];

        int cnt = 0;

        for(int i = 2; i< arr.length; i++){
            arr[i] = i;
        }

        for(int i = 2; i<= Math.sqrt(arr.length); i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j = i + i ; j< arr.length; j= j + i){
                arr[j] = 0;
            }
        }

        for(int i = 2; i<= 10000000; i++){
            if(arr[i] != 0){
                long tmp = arr[i];
                while((double)arr[i] <= ((double)n/(double)tmp)){
                    if((double)arr[i] >= ((double)m/(double)tmp)){
                        cnt++;
                    }
                    tmp = tmp * arr[i];
                }
            }
        }

        System.out.println(cnt);
    }
}