package Recursion.Bubble_sort_using_Recursion;

import java.util.Arrays;

public class Bubble_sort {
    static void bubble_sort(int[]arr,int size,int index) {
        if (size ==arr.length) {
            return;
        }
        if (index < size){
            if (arr[index] > arr[index + 1]) {
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubble_sort(arr, size,index+1);
        }
        bubble_sort(arr,size+1,0);
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubble_sort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
