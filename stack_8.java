package stack;
import java.util.Stack;
public class stack_8{
    public static int[] StockSpan(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] span = new int[arr.length];
        st.push(0);
        span[0] =1;
        for(int i=1;i<arr.length;i++) {
            int curr_price = arr[i];
            while (!st.isEmpty() && arr[st.peek()] < curr_price) {
                st.pop();
            }
            if(st.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = st.peek();
                span[i] = i-prevHigh;
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        // here we will write a function for stock span problem using stack... which has O(n) time complexity..
        int[] arr = {100,80,60,70,60,85,100};
        int[] temp = StockSpan(arr);
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("");
    }
}