package Pattern;

import java.util.Scanner;

//        E
//        ED
//        EDC
//        EDCB
//        EDCBA

public class Pattern_23 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }

    public static void seeding(int n) {

        for (int i = 0; i <= n; i++) {
            char ch = (char) ('A' + n - 1);
            for (int j = 0; j < i; j++) {
                System.out.print(ch);
                --ch;
            }
            System.out.println();

        }
    }
}
