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
public class FindFactorial {
     public static int finadfactorialofN(int n)
    {
        if(n<1)
        {
            return 1;
        }
        return n*finadfactorialofN(n-1);
    }
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(finadfactorialofN(x));
           
        }
    }
}
