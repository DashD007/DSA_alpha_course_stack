package stack;

import java.util.Stack;

public class stack_6 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        String str = "Damodar";
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        StringBuilder str1 = new StringBuilder("");
        while(!st.isEmpty()){
            str1.append(st.pop());
        }
        str = str1.toString();
        System.out.println(str);
    }
}
