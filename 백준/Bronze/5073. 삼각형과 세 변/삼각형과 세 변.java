
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int arr[] = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String[] st = br.readLine().split(" ");

            arr[0] = Integer.parseInt(st[0]);
            arr[1] = Integer.parseInt(st[1]);
            arr[2] = Integer.parseInt(st[2]);
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0){
                break;
            }

            Arrays.sort(arr);

            if(arr[2] >= arr[0] + arr[1]){
                System.out.println("Invalid");
            }else if((arr[0] == arr[1]) && (arr[1] == arr[2])){
                System.out.println("Equilateral");
            }else if((arr[0] == arr[1]) || (arr[1] == arr[2]) || (arr[0] == arr[2])){
                System.out.println("Isosceles");
            }else{
                System.out.println("Scalene");
            }
        }



    }
}


