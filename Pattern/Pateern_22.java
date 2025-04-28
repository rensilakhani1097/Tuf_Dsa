package Pattern;

import java.util.Scanner;

//              A
//             ABA
//            ABCBA
//           ABCDCBA
//          ABCDEDCBA


public class Pateern_22 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }

    public static void seeding(int n) {
        for (int i = 0; i <= n; i++) {
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.print(ch);
                if (a < i) {
                    ch++;
                } else ch--;
            }
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
