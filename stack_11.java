package stack;

import java.util.Stack;

public class stack_11 {
    public static boolean Duplicate(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='a' || ch=='b' || ch=='+'){
                st.push(ch);
                System.out.println(st);
            }
            else{
//                if(ch==')'&& st.peek()=='('){
//                    return true;
//                }
                int count =0;
//                for(int j=i-1;j>=0;j--){
//                    if(str.charAt(j)=='('){
//                        count = i-j;
//                        break;
//                    }
//                }
//                while(count>0){
//                    st.pop();
//                    count--;
//                }
                while(st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }
                else{
                    st.pop();
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        // in this we will write a function to check duplicate parentheses..
        String str = "(((a+b)+(b+a)))";
        System.out.println(Duplicate(str));
    }
}
