/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class CountDigit_{
 public static void main(String[] args) {
    
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(countDigit(x));
        }
    }
    
    public static int countDigit(int n)
    {
       int count= 0;
       if(n==0)
       {
         return 1;
       }
       while(n!=0)
       {
           n= n /10;
           ++count;
       }
       return count;
    }
}
