package Pattern;

import java.util.Scanner;

//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

public class Pattern_07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int n) {
        for(int i =n; i > 0;i--)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
