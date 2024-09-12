import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        long a = Integer.parseInt(st[0]);
        long b = Integer.parseInt(st[1]);
        c = Integer.parseInt(st[2]);
        System.out.println(pow(a,b));
    }
    static long pow(long base, long expo){
        if(expo == 1){
            return base % c;
        }

        long tmp = pow(base, expo/2);

        if(expo % 2 == 1){
            return (tmp * tmp % c) * base % c;
        }

        return tmp * tmp % c;
    }
}
