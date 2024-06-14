package Recursion.Liner_search_Recursion;

public class Lsearch {
    static int Linear_search(int[] arr,int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return Linear_search(arr,i+1,key);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int ans=Linear_search(arr,0,3);
        System.out.println(ans);
    }
}
