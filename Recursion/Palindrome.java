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
public class Palindrome {

    public static boolean CheckPalindrome(int i, String name) {
        if (i >= name.length() / 2) {
            return true;
        }
        if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
            return false;
        }   
        return CheckPalindrome(i + 1, name);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String x = sc.nextLine();
            if(CheckPalindrome(0, x))
            {
                System.out.println("Palindrome ");
            }else{
                System.out.println("Not Palindrome ");
            }
        }
    }
}
