import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ;i<n;i++){
            String[] st = br.readLine().split("\\.");
            if(map.containsKey(st[1])){
                map.put(st[1], map.get(st[1]) + 1 );
            }
            else{
                map.put(st[1], 1);
            }
        }
        List<String> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);

        for(String s : keyList){
            System.out.print(s + " ");
            System.out.println(map.get(s));
        }
    }
}
