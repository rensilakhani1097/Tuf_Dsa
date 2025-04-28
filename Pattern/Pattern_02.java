package Pattern;

import java.util.Scanner;

//        *
//        * *
//        * * *
//        * * * *

class Pattern_02 {
    static int n=0;
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {

        for(int i = 1; i<= n; i++)
        {

            for(int j =1 ;j<i;j++)
            {

                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }

}
