package Pattern;

import java.util.Scanner;

//        *****
//        *   *
//        *   *
//        *   *
//        *****

public class Pattern_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {

        for(int i =0 ; i <n;    i++)
        {
            for(int j =0; j<n; j++)
            {
              if(i==0 || j==0 || i==n-1 || j==n-1)
              {
                  System.out.print("*");
              }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
