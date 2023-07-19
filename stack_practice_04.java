package stack;

public class stack_practice_04{
    public static int trappingWater(int[] arr){
        int[] water = new int[arr.length];
        int[] mxl = new int[arr.length];
        int[] mxr = new int[arr.length];
        mxl[0] = arr[0];
        mxr[arr.length-1] = arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            mxl[i] = Math.max(arr[i],mxl[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            mxr[i] = Math.max(mxr[i+1],arr[i]);
        }
        for(int i=0;i<water.length;i++){
            water[i] = Math.min(mxl[i],mxr[i]) -arr[i];
        }
        int trap =0;
        for(int i=0;i<water.length;i++){
            trap += water[i];
        }
        return trap;
    }
    public static void main(String[] args){
        //7 0 4 2 5 0 6 4 0 5
        int[] arr = {0,0,0,5,0,0};
        System.out.println(trappingWater(arr));
    }
}