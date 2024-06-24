import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        List<Double> li = new ArrayList<Double>();
        for(int i=0;i<n;i++){
            li.add(Double.parseDouble(st.nextToken()));
        }
        double max = Collections.max(li);
        double sum =0 ;
        for(int i=0;i<li.size();i++){
            li.set(i,li.get(i)/max*100);
            sum += li.get(i);
        }
        System.out.println(sum/n);


    }

}