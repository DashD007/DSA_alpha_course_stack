package stack;

import java.util.Stack;

public class stack_practice_01 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static boolean isPalindrome(Node head){
        Stack<Integer> st = new Stack<>();
        boolean res = true;
        Node slow = head;
        while(slow!=null){
            st.push(slow.data);
            slow = slow.next;
        }
        while(head!=null){
            if(head.data==st.peek()){
                res = true;
                st.pop();
                head = head.next;
            }
            else{
                res = false;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        //here we will write function to check if a linkedlist is palindrome or not..
        stack_practice_01 ll = new stack_practice_01();
//        ll.add(1);
//        ll.add(2);
//        ll.add(3);
        ll.add(1);
        ll.add(2);
        ll.add(1);
        System.out.println(isPalindrome(head));
    }
}
