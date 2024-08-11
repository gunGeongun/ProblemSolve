import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        boolean check = true;
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                check = false;
                break;
            }
            left++;
            right--;
        }
        if (check) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}

