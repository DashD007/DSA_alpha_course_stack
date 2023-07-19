package stack;
import java.util.*;
public class stack_4 {
    public static void main(String[] args) {
        //here we will learn how to implement a stack using collection framework;
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
