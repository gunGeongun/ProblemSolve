import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n,m;
    static int[] arr;
    static int left, right;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] st = br.readLine().split(" ");

        n = Integer.parseInt(st[0]);
        m = Integer.parseInt(st[1]);

        arr = new int[n];
        int sum = 0;
        st = br.readLine().split(" ");
        for(int i =0;i<n;i++){
            arr[i] = Integer.parseInt(st[i]);
            left = Math.max(left, arr[i]);
            sum += arr[i];
        }
        right = sum;

        System.out.println(binarySearch(left, right));
    }

    public static long binarySearch(long left, long right){
        while(left <= right){
            long mid = (left + right) / 2;
            long sum = 0;
            int count = 1;

            for(int i =0;i<n;i++){
                sum += arr[i];
                if(sum > mid){
                    sum = arr[i];
                    count++;
                }
            }

            if(count <= m){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }

        }
        return left;
    }

}


