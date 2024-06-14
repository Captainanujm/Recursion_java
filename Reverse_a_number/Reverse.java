package Recursion.Reverse_a_number;
import java.lang.Math;
public class Reverse {
    static int reverse(int num,int count){
        if(num/10==0){
            return num;
        }
        int a=num%10;
        return (int) (a*Math.pow(10,count-1)+reverse(num/10,count-1));
    }
    public static void main(String[] args) {
        int num=89;
        int ans=reverse(num,2);
        System.out.println(ans);
    }
}
