import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split("-");
        int result = 0;
        for(int i = 0;i<st.length;i++){
            int tmp = plusSum(st[i]);
            if(i == 0){
                result += tmp;
            }
            else {
                result -= tmp;
            }
        }
        System.out.println(result);


    }

    public static int plusSum(String s){
        int sum = 0;

        String[] st = s.split("\\+");

        for(String i : st){
            sum += Integer.parseInt(i);
        }
        return sum;
    }
}


