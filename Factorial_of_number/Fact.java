package Recursion.Factorial_of_number;

public class Fact {
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

    }
    public static void main(String[] args) {
       int ans= factorial(5);
        System.out.println(ans);

    }
}
