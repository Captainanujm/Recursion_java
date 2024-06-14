package Recursion.Check_sorted_array;

public class sorted_Array {
    static boolean isSorted(int[] arr,int i){
        if(i+1==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr,i+1);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        boolean ans = isSorted(arr, 0);
        System.out.println(ans);
    }
}
