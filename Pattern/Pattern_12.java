package Pattern;

import java.util.Scanner;

//        1
//        01
//        101
//        0101
//        10101

public class Pattern_12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            seeding(x);
        }
    }

    public static void seeding(int n) {
        int a=1;
        for (int i = 0; i <= n; i++) {
            if(i%2==1)
            {
                a=1;
            }else a=0;
            for (int j = 0; j < i; j++) {
                System.out.print(a+"");
                a= 1-a;
            }
            System.out.println();
        }
    }
}
