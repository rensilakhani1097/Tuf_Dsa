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
public class PrintNameNTime {

    public static void printname(int n, String name) {
        if (n <= 0) {
            return;
        }
        System.out.println(name);
        printname(n - 1, name);

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            // String name = sc.nextLine();
            printname(x, "Raj");
        }
    }
}
