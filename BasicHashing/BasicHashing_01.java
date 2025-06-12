/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BasicHashing;

import java.util.Scanner;

/**
 *
 * @author staah
 */
public class BasicHashing_01 {

    public static void hashing()
    {
        // Scanner sc = new Scanner(System.in);
        String basestr = "rensilakhanihimmatbhailakhani";
        
        int[] basearr = new int[26];
        for(int i=0; i<basestr.length();i++)
        {
            basearr[basestr.charAt(i)-'a']++;
        }
        System.out.println(basearr['b'-'a']);
    }

    public static void CapitalLetterHashing()
    {
        String s = "HappyBirthDayNitiMakwana";
        int[] arr = new int[256];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int n;
        // n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        // int[] abc = new int[13];
        // for (int i = 0; i < n; i++) {
        //     abc[arr[i]] += 1;
        // }
        // int number = sc.nextInt();
        // System.out.println(abc[number]);
        hashing();
    }
}
