/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class PrintAllDivisors {

    public static void divisors(int n) {
        
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                if (n/i==i) {
                    System.out.print(i + " ");
                }else{
                    System.out.print(n/i + " ");
                    System.out.print(i+ " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            divisors(x);
        }
    }
}
