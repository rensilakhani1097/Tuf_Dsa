package Pattern;

import java.util.Scanner;

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

public class Pattern_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {
        int p =0;
        for(int i = 1; i<= n; i++)
        {

            for(int j =1 ;j<=i;j++)
            {
                ++p;
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
