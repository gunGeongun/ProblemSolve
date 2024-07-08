import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            String input = br.readLine();
            if(check(input)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
    public static boolean check(String input){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                char open_ch = stack.pop();
                if(open_ch != '('){
                    return false;
                }
            }

        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}