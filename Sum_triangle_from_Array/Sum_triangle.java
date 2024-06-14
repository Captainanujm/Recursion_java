package Recursion.Sum_triangle_from_Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum_triangle {
    static void triangle(int []arr){
        if(arr.length==1){
            return;
        }
        int sum=0;
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i]+arr[i+1];
            list.add(sum);
        }
        int[]newarr=new int[list.size()];
        for(int i=0;i<newarr.length;i++){
            newarr[i]=list.get(i);
        }
        triangle(newarr);
        System.out.println(Arrays.toString(newarr));
    }

    public static void main(String[] args) {
        int[] arr={1,2,5,9,6,1,2};
        triangle(arr);
        System.out.println(Arrays.toString(arr));
    }
}
