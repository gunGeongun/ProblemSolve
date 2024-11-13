import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n,k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        long start = 1;
        long end = k;
        long answer = 0;
        while(start<=end){
            long mid = (start+end) / 2;
            long count = 0;

            for(int i = 1; i<=n;i++){
                count += Math.min(mid / i, n);
            }

            if(count < k){
                start = mid + 1;
            }
            else{
                answer = mid;
                end = mid - 1;
            }

        }
        System.out.println(answer);


    }
}

