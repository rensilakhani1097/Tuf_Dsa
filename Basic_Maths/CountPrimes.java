/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class CountPrimes {

    public static void isprimeNumber(int n) {
        if (n == 0 || n == 1 || n% 2 ==0 ) {
            System.out.println(n + " is  NOT Prime");
        } else {
            for (int i = 3; i < Math.sqrt(n); i+=2) {
                if (n % i == 0) {
                    System.out.println(n + " is  NOT Prime");
                } 
            }
           System.out.println(n + " is Prime Number ");
        }
    }

    public static int countPrimess(int n) {

        if (n == 0 || n == 1) {
            return 0;
        }

        boolean[] isprime = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            isprime[i] = true;
        }

        for (int i = 2; i<= Math.sqrt(n); i++) {
            if (isprime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isprime[j] = false;

                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (isprime[i]) {
                System.out.print(i + " ");
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            countPrimess(x);
            System.out.println("");
            isprimeNumber(x);
        }
    }
}
