/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author staah
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 100, 5, 99};

        int n = arr.length;
        System.out.println("Before selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < n; i++) {
            int first = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[first]) {
                    first = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[first];
            arr[first] = temp;
        }
        System.out.println("After selection sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
