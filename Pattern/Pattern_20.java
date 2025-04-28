package Pattern;

import java.util.Scanner;

//A B C D E
//A B C D
//A B C
//A B
//A

public class Pattern_20 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {
        for(int i =n; i > 0;i--)
        {
            char ch = 'A';
            for(int j =0; j<i; j++)
            {
                System.out.print(ch + " ");
                ++ch;
            }
            System.out.println();
        }
    }
}
