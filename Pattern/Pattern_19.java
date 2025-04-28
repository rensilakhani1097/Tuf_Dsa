package Pattern;

import java.util.Scanner;

//A
//A B
//A B C
//A B C D
//A B C D E

public class Pattern_19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {

        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {

                System.out.print(ch + " ");
                ++ch;
            }
            System.out.println();
        }
    }
}
