package stack;

import java.util.ArrayList;

public class stack_2 {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() ==0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size()-1);
            return top;
        }

        //size
        public static int size(){
            return list.size();
        }
    }
    public static void main(String[] args) {
        //here we will learn how to implement stack using arraylist..
        stack st = new stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println("size: " + st.size());

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
