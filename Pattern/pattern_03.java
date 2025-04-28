package Pattern;

import java.util.Scanner;

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5

public class pattern_03 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {
        for(int i =1 ; i <=n;    i++)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
