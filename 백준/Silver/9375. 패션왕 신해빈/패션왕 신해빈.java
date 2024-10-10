import java.io.*;
import java.util.HashMap;

public class Main {
    static int n;
    static HashMap<String, Integer> hashMap;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i =0 ;i<n;i++){
            int m = Integer.parseInt(br.readLine());
            hashMap = new HashMap<>();
            for(int j =0;j<m;j++){
                String[] st = br.readLine().split(" ");
                String kind = st[1];
                if(hashMap.containsKey(kind)){
                    hashMap.put(kind, hashMap.get(kind) + 1);
                }
                else{
                    hashMap.put(kind,1);
                }
            }
            int result = 1;

            for(int value : hashMap.values()){
                result *= (value+1);
            }

            System.out.println(result-1);

        }

    }
}

