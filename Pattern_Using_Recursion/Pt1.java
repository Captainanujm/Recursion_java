package Recursion.Pattern_Using_Recursion;

public class Pt1 {
    static void pattern1(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            pattern1(row,col+1);
        }
        else{
            System.out.println();
            pattern1(row-1,0);

        }

    }
    static void pattern2(int row,int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("*");
        } else {
            pattern2(row - 1, 0);
            System.out.println();

        }
    }

    public static void main(String[] args) {
        pattern1(2,0);
       System.out.println();
        pattern2(2,0);
    }
}
