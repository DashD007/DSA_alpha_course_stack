package stack;

public class stack_1 {
    public static int top=-1;
    static int[] arr = new int[5];
    public static boolean isempty(){
        if(top!=-1){
           return false;
        }
        return true;
    }
    //push
    public static void push(int data){
        if(top==4){
            System.out.println("Stack is overflow");
            return;
        }
        top = top+1;
        arr[top] = data;
    }
    //pop
    public static void pop(){
        if(top== -1){
            System.out.println("Stack is empty");
            return;
        }
        arr[top] = 0;
        top = top-1;
    }
    //top function
    public static int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    public static void main(String[] args) {
        // here we will learn how to implement stack using array;
        stack_1 st = new stack_1();
        System.out.println(st.isempty());
        push(1);
        push(2);
        push(3);
        push(4);
        System.out.println(peek());
        pop();
        System.out.println(peek());
        System.out.println(st.isempty());
    }
}
