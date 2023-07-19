package stack;

import java.util.Stack;

public class stack_practice_03 {
    public static String Decode(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder str1 = new StringBuilder("");
        StringBuilder temp = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==']'){
                while(!st.isEmpty() && st.peek()!= '['){
                    temp.append(st.pop());
                }
                temp.reverse();
                st.pop();
                int t = st.pop() -'0';
                StringBuilder temp1 = new StringBuilder("");
                for(int j=0;j<t;j++){
                    temp1= temp1.append(temp);
                }
                temp = temp1;
                str1 = temp;
            }
            else{
                st.push(str.charAt(i));
            }

        }
        return str1.toString();
    }
    public static void main(String[] args) {
        // here we will write function to decode the encoded string using stack..
        String str = "[cv]";
        System.out.println(Decode(str));
    }
}
