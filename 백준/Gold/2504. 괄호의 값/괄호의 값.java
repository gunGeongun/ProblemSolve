import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    static int n =1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int result = 0;
        int value=  1;
        int stat = 1;

        for(int i= 0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch == '('){
                stack.push(ch);
                value *= 2;
            }
            else if(ch == '['){
                stack.push(ch);
                value *= 3;
            }
            else if(ch == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    stat =0;
                    break;
                }
                if(input.charAt(i-1) == '('){
                    result += value;
                }
                stack.pop();
                value /= 2;

            }
            else if(ch == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    stat =0;
                    break;
                }
                if(input.charAt(i-1) == '['){
                    result += value;
                }
                stack.pop();
                value /= 3;
            }
            else{
                stat = 0;
                break;
            }
        }
        if(stat == 0 || !stack.isEmpty()){
            System.out.println(0);
            
        }
        else{
            System.out.println(result);
        }

    }
}