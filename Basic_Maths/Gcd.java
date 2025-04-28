/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author staah
 */
public class Gcd {

    /**
     * @param n1
     * @param n2
     * @return
     */
    public static int GCD(int n1, int n2) {

        ArrayList<Integer> arr_n1 = new ArrayList<Integer>();
        ArrayList<Integer> arr_n2 = new ArrayList<Integer>();

        for (int i = 1; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) {
                if (n1 / i == i) {
                    arr_n1.add(i);
                } else {
                    arr_n1.add(i);
                    arr_n1.add(n1 / i);
                }
            }
        }
        for (int i = 1; i <= Math.sqrt(n2); i++) {
            if (n2 % i == 0) {

                if (n2/ i == i) {
                    arr_n2.add(i);
                } else {
                    arr_n2.add(i);
                    arr_n2.add(n2 / i);
                }
            }
        }
            System.out.println("n1 divisor");
            for (int elem : arr_n1) {
                System.out.print(elem + " ");
            }
            System.out.println("");

            System.out.println("n2 divisor");
            for (int elem : arr_n2) {

                System.out.print(elem + " ");
            }
            System.out.println("");
            arr_n1.retainAll(arr_n2);
            System.out.println("Coomman Element are : " + arr_n1);
            return Collections.max(arr_n1);
        }
    
        public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int y = sc.nextInt();
           System.out.println( GCD(x, y));
        }
    }
}
