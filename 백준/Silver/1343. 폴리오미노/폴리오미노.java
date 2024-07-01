import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == 'X') {
                int count = 0;
                while (i < input.length() && input.charAt(i) == 'X') {
                    count++;
                    i++;
                }
                if (count % 2 != 0) {
                    System.out.println("-1");
                    return;
                }
                while (count >= 4) {
                    result.append("AAAA");
                    count -= 4;
                }
                if (count == 2) {
                    result.append("BB");
                }
            } else {
                result.append('.');
                i++;
            }
        }

        System.out.println(result.toString());
    }
}