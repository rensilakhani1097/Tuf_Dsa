/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class FibonakiSeries {

    public static int PrintFibonaki(int x) {
        
        if (x == 0 || x == 1) {
           return x;
        }
        return (PrintFibonaki(x - 1) + PrintFibonaki(x - 2));
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            for (int i = 0; i <= x; i++) {
                System.out.print(PrintFibonaki(i) + " ");
            }
        }
    }
}
