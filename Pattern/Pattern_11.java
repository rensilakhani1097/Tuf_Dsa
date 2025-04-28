package Pattern;

import java.util.Scanner;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern_11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {

        for(int i=0;i<=n;i++)
        {
            for(int j=0 ;j<i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0 ;j<i;j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
