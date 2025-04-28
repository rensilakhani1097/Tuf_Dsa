/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author staah
 */

 //  Armstrong means number is equal to its sum of digit power 

public class ArmStrong {

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

    public static boolean isArmstrong(int n) {
        int originalnum = n;
        int result = 0;
        int count = countDigit(n);
        while (originalnum != 0) {
            int lastdig = originalnum % 10;
            result += Math.pow(lastdig, count);
            originalnum = originalnum / 10;
        }
        if (n == result) {
            System.out.println(n + " is armstrong Number ...");
            return true;
        } else {
            System.out.println(n + " is NOT  armstrong Number ...");
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            System.out.println(isArmstrong(x));
        }
    }
}
