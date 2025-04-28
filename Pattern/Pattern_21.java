package Pattern;

import java.util.Scanner;

//        A
//        B B
//        C C C
//        D D D D
//        E E E E E

public class Pattern_21 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {
        char ch = 'A';
        for(int i =0; i <n;i++)
        {

            for(int j =0; j<=i; j++)
            {
                System.out.print(ch + " ");

            } ch++;
            System.out.println();
        }
    }
}
