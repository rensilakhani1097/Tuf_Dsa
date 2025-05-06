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
public class Print1toN {
    static int count =1 ;
    public static void  printdigit(int i,int n)
    { 
        if (i>n) {
            return;
        }
        System.out.println(i);
        printdigit(i+1, n);
    }

    public static void reverseprint(int i )
    {
        if (i<1) {
            return ;
        }
        System.out.println(i);
        reverseprint(i-1);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            printdigit(1,x);
            System.out.println("------");
            reverseprint(x);
        }
    }
}
