import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Double> map =new HashMap<>();

        String input = "";
        int cnt= 0;
        while((input = br.readLine())!=null){
            if(map.containsKey(input) ){
                map.put(input,map.get(input)+1);
            }else{
                map.put(input,1.0);
            }
            cnt++;
        }
        List<String> keyset = new ArrayList<>(map.keySet());
        Collections.sort(keyset);

        for(String key : keyset){
            System.out.printf("%s %.4f\n",key,map.get(key)/cnt*100);
        }
    }
}
