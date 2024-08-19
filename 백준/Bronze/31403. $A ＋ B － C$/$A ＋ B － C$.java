import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        int d = Integer.parseInt(a + b);
        int fir = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int sec = d - Integer.parseInt(c);
        System.out.println(fir);
        System.out.println(sec);
    }
}

