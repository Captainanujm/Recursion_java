package Recursion.Product_of_digits;

public class product {
    static int product(int num){
        if(num/10==0){
            return num;
        }
        int no=num%10;
        return no*product(num/10);
    }
    public static void main(String[] args) {
        int num=345677;
        int ans=product(num);
        System.out.println(ans);
    }
}
