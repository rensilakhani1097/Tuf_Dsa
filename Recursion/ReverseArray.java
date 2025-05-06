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
public class ReverseArray {

    public static void ReverseArrayfn(int[] arr, int start, int end) {

        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            ReverseArrayfn(arr, start + 1, end - 1);
        }

    }

    public static void withoutRecursion(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            int[] arr = new int[x];
            for (int i = 0; i < x; i++) {
                arr[i] = sc.nextInt();
            }
            ReverseArrayfn(arr, 0, arr.length - 1);
            withoutRecursion(arr);
            for (int elem : arr) {
                System.out.print(elem + " ");
            }
        }
    }
}
