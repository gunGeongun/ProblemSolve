import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1003002];

        for(int i =2; i<arr.length; i++){
            arr[i] = i;
        }

        for(int i = 2; i<Math.sqrt(arr.length); i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j = i + i ; j< arr.length;j= j+i){
                arr[j] = 0;
            }
        }


        for(int i = n; i<arr.length; i++){
            if(i == 1){
                System.out.println(2);
                break;
            }
            String tmp = String.valueOf(arr[i]);
            if(checkPal(tmp) && arr[i] != 0){
                System.out.println(arr[i]);
                break;
            }
        }

    }
    public static boolean checkPal(String input) {
        String reverseString = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reverseString += input.charAt(i);
        }
        return input.equals(reverseString);
    }

}