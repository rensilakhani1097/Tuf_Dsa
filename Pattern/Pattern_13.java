package Pattern;

import java.util.Scanner;

//        1        1
//        12      21
//        123    321
//        1234  4321
//        1234554321

public class Pattern_13 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }

    public static void seeding(int n) {
        for (int i = 1; i <= n; i++) {
            int space = 2*(n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >0; j--) {
                System.out.print(j);
            }
            System.out.println();
            space-=2;
        }
    }
}
