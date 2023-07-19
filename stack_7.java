package stack;
import java.util.Stack;
public class stack_7 {
    public static void pushAtBottom(Stack<Integer> st,int data){
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int key = st.pop();
        pushAtBottom(st,data);
        st.push(key);
    }
    public static void ReverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int key = st.pop();
        ReverseStack(st);
        pushAtBottom(st,key);
    }
    public static void main(String[] args) {
        // in this lecture we will learn how to reverse a stack
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        ReverseStack(st);
        System.out.println(st);
    }
}
