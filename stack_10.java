package stack;

import java.util.Stack;

public class stack_10 {
    public static boolean ValidParenthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                st.push(str.charAt(i));
            } else if (str.charAt(i)==')' && st.peek()=='(') {
                st.pop();
            }
            else if(str.charAt(i)=='}' && st.peek()=='{'){
                st.pop();
            } else if (str.charAt(i)==']' && st.peek()=='[') {
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        //here we will write a function to check valid parenthesis..
        String str = "({[]}}())";
        System.out.println(ValidParenthesis(str));
    }
}
