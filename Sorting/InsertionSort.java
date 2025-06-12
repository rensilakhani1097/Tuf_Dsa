/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sorting;

/**
 *
 * @author staah
 */
public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {500, 598, 321, 100, 5, 1452};

        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j= i-1 ;
            while (j>=0 && arr[j] > temp) { 
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= temp;
        }    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
