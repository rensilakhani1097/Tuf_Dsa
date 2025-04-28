package Pattern;

import java.util.Scanner;

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern_06 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {
        for(int i =n; i > 0;i--)
        {
            for(int j =0; j<i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
