/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class CountDigit_1 {

    public static int countDigits(int n) {
        int orgnum = n;
        int count = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            if (lastdigit != 0 && orgnum % lastdigit == 0) {
                ++count;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(countDigits(x));
         }
    }

}
