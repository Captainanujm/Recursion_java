package Recursion.Fibbo_number;

public class FibboNo {
    static int fibbo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibo=fibbo(n-1)+fibbo(n-2);
        return fibo;

    }
    public static void main(String[] args) {
        int ans=fibbo(7);
        System.out.println(ans);
    }
}
