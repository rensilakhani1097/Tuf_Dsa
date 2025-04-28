package Pattern;

import java.util.Scanner;

//        33333
//        32223
//        32123
//        32223
//        33333

public class Pattern_24 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }
    public static void seeding(int a) {
        int n = 2*a-1;
        for(int i =0; i < n;i++)
        {
            for(int j =0; j < n;j++) {
                int x = a - Math.min(Math.min(i,j), Math.min(n-i-1,n-j-1));
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
