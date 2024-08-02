import java.util.*;

public class BracketBalancing {
    public static void main(String[] args){
        String s = "[()]{}{[()()]()}";
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }
            else{
                if(s.charAt(i)==']' && stk.peek()=='['){
                    stk.pop();
                }
                else if(s.charAt(i)==')' && stk.peek()=='('){
                    stk.pop();
                }
                else if(s.charAt(i)=='}' && stk.peek()=='{'){
                    stk.pop();
                }
            }
        }
        if(stk.empty()){
            System.out.print("Balanced");
            return;
        }
        System.out.print("Unbalanced");
    }
}