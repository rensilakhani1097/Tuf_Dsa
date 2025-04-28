package Pattern;

import java.util.Scanner;

//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

public class Pattern_16 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }

    public static void nTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + 1; j++) {
                System.out.print("*");;
            }
            for (int j = 1; j <= (i-1)*2; j++) {
                System.out.print(" ");;
            }
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            int space = 2*(n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
            space-=2;
        }
    }
}
