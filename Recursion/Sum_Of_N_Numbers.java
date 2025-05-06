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
public class Sum_Of_N_Numbers {
    public static int SumofNumbers(int n)
    {
        if(n<0)
        {
            return 0;
        }
        int sum = n+ SumofNumbers(n-1);
        return sum;

    }
    public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(SumofNumbers(x));
           
        }
    }
}
