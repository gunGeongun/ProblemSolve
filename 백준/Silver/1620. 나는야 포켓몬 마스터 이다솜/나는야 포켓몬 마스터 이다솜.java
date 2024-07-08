import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int n = Integer.parseInt(st[0]);
        int m = Integer.parseInt(st[1]);

        Map<String,Integer> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();

        for(int i=0;i<n;i++){
            String name = br.readLine();
            map1.put(name,i+1);
            map2.put(i+1,name);
        }
        for(int i=0;i<m;i++){
            String s = br.readLine();
            if(Character.isDigit(s.charAt(0))){
                int num = Integer.parseInt(s);
                System.out.println(map2.get(num));
            }
            else{
                System.out.println(map1.get(s));
            }
        }
    }
    
}