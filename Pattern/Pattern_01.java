package Pattern;

import java.util.Scanner;

//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *
//            * * * * *

class Pattern_01 {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            starPateern(x);
        }
    }

    public static void starPateern(int n) {
            for(int i =0 ; i<n; i++)
            {
                for(int j =0 ;j <n ; j++)
                {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
    }
}
