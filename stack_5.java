package stack;
import java.util.*;
public class stack_5 {
    public static void PushAtBottom(Stack<Integer> st ,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int k = st.pop();
        PushAtBottom(st,data);
        st.push(k);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        PushAtBottom(st,4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
