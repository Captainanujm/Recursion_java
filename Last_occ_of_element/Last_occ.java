package Recursion.Last_occ_of_element;

public class Last_occ {
    static int last_occ(int[] arr,int key,int i){
        if(i==0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return last_occ(arr,key,i-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,9,6,1,2};
        int key=2;
        int ans=last_occ(arr,key,arr.length-1);
        System.out.println(ans);
    }
}
