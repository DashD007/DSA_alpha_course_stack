package stack;

import java.util.Stack;

public class stack_9 {
    public static int[] NextGreater(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] next = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            while(!st.isEmpty()  && st.peek()<arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                next[i] = -1;
            }
            else{
                next[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return next;
    }
    public static void main(String[] args) {
        //here we will write a function to find the next greater of each elements of an array..
        int[] arr = {6,8,0,1,3};
        int[] temp = NextGreater(arr);
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
