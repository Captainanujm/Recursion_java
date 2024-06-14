package Recursion.Merge_sort_Recursion;

import java.util.Arrays;

public class Merge_sort {
    static int[] merge_sort(int[] arr,int low,int high){
        if(arr.length==1){
           return arr;
        }
        int mid=(low+high)/2;
        int []left=merge_sort(arr,low,mid);
        int []right=merge_sort(arr,mid+1,high);
        return merge(left,right);
    }
    static int[] merge(int []a,int []b){
        int[] ans=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j]){
                ans[k]=a[i];
                i++;
                k++;
            }
            if(a[i]>b[j]){
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        if(i<a.length) {
            while (i < a.length) {
                ans[k] = a[i];
                i++;
                k++;
            }
        }
        if(j<b.length){
            while(j<b.length){
                ans[k]=b[j];
                j++;
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arra={8,2,9,5,4,6};
        int[] mainans=merge_sort(arra,0,arra.length);
        System.out.println(mainans);
    }
}
