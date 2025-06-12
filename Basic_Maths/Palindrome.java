/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
// Palindrome means number is eual to its reversed

public class Palindrome {
    public static boolean isPalindrome(int x) {
            int original = x;
            if (x<0) {
                return false;
            }else{
                long reverser = 0;
                while (x != 0) {
                    int lastdig = x % 10;
    
                    reverser += lastdig;
                    reverser *= 10;
                    x = x / 10; 
                }
                reverser /= 10;
                return reverser==original;
            }
    }
    
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(isPalindrome(x));
        }
     }
}
