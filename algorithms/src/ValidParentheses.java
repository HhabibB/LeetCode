import java.util.*;
public class ValidParentheses{
    public boolean isValid(String s){

        Stack<Character> stk  = new Stack<>();
        char[] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i] == '(') {
                stk.push(')');
            }else if(ch[i] == '{') {
                stk.push('}');
            }else if(ch[i] == '[') {
                stk.push(']');
            }else if(stk.empty() || stk.pop() != ch[i]){
                return false;
            }
        }
        return stk.empty();
    }
}
