/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sorting;

/**
 *
 * @author staah
 */
public class MergeSort {

    public static void dividearray(int[] a, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            dividearray(a, low, mid);
            dividearray(a, mid + 1, high);
            mergesorting(a, low, mid, high);

        }
    }

    public static void mergesorting(int[] a, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] b = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
            } else {
                b[k] = a[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = a[i];
            i++;
            k++;
        }
        while (j <= high) {
            b[k] = a[j];
            j++;
            k++;
        }
        for(int p = 0; p < b.length; p++) {
            a[low+p]= b[p];
        }
    }



    public static void main(String[] args) {
        int[] arr = {10, 45, 2, 36, 4, 50, 1, 66, 13};
        dividearray(arr, 0, arr.length - 1);
        for(int i =0 ; i< arr.length ; i++)
        {
            System.out.print(arr[i] + " ");

        }
    }


    
}
