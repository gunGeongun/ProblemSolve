import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splitMinus = br.readLine().split("-");

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<splitMinus.length;i++){
            int tmp = 0;
            String[] splitPlus = splitMinus[i].split("\\+");
            for(int j = 0;j < splitPlus.length;j++){
                tmp += Integer.parseInt(splitPlus[j]);
            }
            arr.add(tmp);
        }
        int result = arr.get(0);
        for(int i=1;i<arr.size();i++){
            result -= arr.get(i);
        }
        System.out.println(result);

    }
}
