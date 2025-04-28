/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class Reverse_Integer {

    public static int reverse(int x) {

        // String Stringx = String.valueOf(x);
        // StringBuilder number = new StringBuilder(Stringx);
        // StringBuilder ReverseString = number.reverse(); 
        // System.err.println(ReverseString);
 

            long reverser = 0;
            while (x != 0) {
                int lastdig = x % 10;

                reverser += lastdig;
                reverser *= 10;
                x = x / 10;
            }
            reverser /= 10;
            if (reverser >= Integer.MAX_VALUE || reverser <= Integer.MIN_VALUE) {
                return 0;
            } 
            if (x < 0) {
                return (int) (reverser *= -1);
            }
            return (int) reverser;
        
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            reverse(x);
        }
    }
}
