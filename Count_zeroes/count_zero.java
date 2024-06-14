package Recursion.Count_zeroes;

public class count_zero {
    static int count_zeroes(int num){
        int sum=0;
        if(num==0){
            return 0;
        }
        if(num%10==0){
            sum++;
        }
        int count=sum+count_zeroes(num/10);
        return count;
    }
    public static void main(String[] args) {
        int num=9010806;
        int ans=count_zeroes(num);
        System.out.println(ans);
    }
}
