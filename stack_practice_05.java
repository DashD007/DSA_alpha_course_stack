package stack;
import java.util.Stack;
public class stack_practice_05 {
    public static int[] nearestGreaterRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i]= arr[st.peek()];
            }
            st.push(i);
        }
        return temp;
    }
    public static int[] nearestGreaterLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            while(!st.isEmpty() && arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return temp;
    }

    public static int[] nearestSmallerRight(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return temp;
    }
    public static int[] nearestSmallerLeft(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        // here we will write a function for..
        // nearest greater right ---or next largest element on gfg
        // nearest greater left  --- nearest smallest element
        // nearest smaller right
        int[] arr = {6,2,7,0,1,4};
        int temp[] = nearestGreaterRight(arr);
        System.out.print("nearest greater Right ");
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("");
        temp = nearestGreaterLeft(arr);
        System.out.print("nearest greater left ");
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("");
        System.out.print("nearest smallest right ");
        temp = nearestSmallerRight(arr);
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("");
        System.out.print("nearest smallest left ");
        temp = nearestSmallerLeft(arr);
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
