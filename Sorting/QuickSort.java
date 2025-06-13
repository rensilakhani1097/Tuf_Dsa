/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Sorting;

/**
 *
 * @author staah
 */
public class QuickSort {

    public static void quickpartion(int[] arr,int low,int high)
    {
            if (low<high) {
                int pivot = quicksorting(arr, low, high);
                quickpartion(arr, low, pivot-1);
                quickpartion(arr, pivot+1, high);
            }
    }
    public static int quicksorting(int[] arr , int low , int high)
    {
        int pivot = arr[low];
        int start = low;
        int end = high;
        while (start<end) { 
            while (start <= high && arr[start] <= pivot){start++;}

            while (end >= low && arr[end] > pivot){end--;}
           
            if (start<end) {
                swap(arr,start,end);
            }
        } 
        swap(arr,low,end);
        return  end;
    }
    public static void swap(int[] arr,int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
     public static void main(String[] args) {
        int[] arr = {10, 45, 2, 36, 4, 50, 1, 66, 13};
        System.out.println(arr.length-1);    
        // quickpartion(arr,0,arr.length-1);
        quickpartion(arr, 0, arr.length-1);
        for(int a :arr)
        {
            System.out.print(a + " ");
        }
     }
}
