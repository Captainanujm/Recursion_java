package Recursion.Rotated_binary_search;

public class Rsb {
    static int Rotated(int[] arr,int start,int end,int target){
        int mid=(start+end)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(arr[mid]>arr[start]){
            if((target<arr[mid])&&(target<arr[start])){
                return Rotated(arr,mid+1,end,target);
            }
            if((target<arr[mid])&&(target>arr[start])){
                return Rotated(arr,start,mid,target);
            }
        }
        if(arr[mid]<arr[start]){
            if((target>arr[mid])&&(target<arr[start])){
                return Rotated(arr,mid+1,end,target);
            }
            if((target>arr[mid])&&(target>arr[start])){
                return Rotated(arr,start,mid,target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int start=0;
        int end=arr.length-1;
        int target=5;
        int ans=Rotated(arr,start,end,target);
        System.out.println(ans);
        //this code needs modification......


    }
}
