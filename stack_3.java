package stack;

public class stack_3 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            //push operation is similar to addfirst funtion..
            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            //pop function is similar to removefirst function of linkedlist..
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int val  = head.data;
            return val;
        }
    }
    public static void main(String[] args) {
        // in this lecture we will learn how to implement stack using linkedlist..
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
