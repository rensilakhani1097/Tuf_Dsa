package Pattern;

import java.util.Scanner;

//        *********
//         *******
//          *****
//           ***
//            *

public class Pattern_09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {

        for(int i=n; i>0;i--)
        {
            for(int a =1; a<=n-i ; a++ )
            {
                System.out.print(" ");
            }
            for(int a =0; a<2*i-1 ; a++ )
            {
                System.out.print("*");
            }
            for(int a =1; a<=n-i ; a++ )
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
