import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(st[i]);
        }

        int i = 1;

        int tmp;

        while(true){
            tmp = 0;
            for(int j = 0; j < arr.length; j++){
                if((i % arr[j]) == 0 ){
                    tmp +=1;
                }
            }
            if(tmp >= 3){
                break;
            }
            i++;
        }
        System.out.println(i);

    }
}