package stack;

import java.util.Stack;

public class stack_12 {
    public static int[] nextSmallerRight(int[] height){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[height.length];
        for(int i= height.length-1;i>=0;i--){
            while(!st.isEmpty() && height[i]<height[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = height.length;
            }
            else{
                temp[i] = st.peek();
            }
            st.push(i);
        }
        return temp;
    }
    public static int[] nextSmallerLeft(int[] height){
        Stack<Integer> st = new Stack<>();
        int[] temp = new int[height.length];
        for(int i=0;i<height.length;i++){
            while(!st.isEmpty()&& height[i]<height[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                temp[i] = -1;
            }
            else{
                temp[i] = st.peek();
            }
            st.push(i);
        }
        return temp;
    }
    public static int MaxArea(int[] height){
        int[] nsl = nextSmallerLeft(height);
        int[] nsr = nextSmallerRight(height);
        int maxArea= Integer.MIN_VALUE;
        //int[] temp= new int[height.length];
        for(int i=0;i<height.length;i++) {
            int curheight = height[i];
            int area = curheight*(nsr[i]-nsl[i]-1);
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        // in this we will drive a function to cal maximum area of a rectangle in histogram..
        int[] arr = {2,1,5,6,2,3};
        System.out.println(MaxArea(arr));
    }
}
