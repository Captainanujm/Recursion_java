package Recursion.First_occ_of_element;

public class First_occ {
    static int first_occ(int []arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
      return first_occ(arr,key,i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,9,6,1,2};
        int key=5;
        int ans=first_occ(arr,key,0);
        System.out.println(ans);
    }
}
