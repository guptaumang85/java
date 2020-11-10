package com.company;

public class QuickSort {
   void sort(int[] arr,int high,int low) {
       if (low < high) {
           int pi = partition(arr, low, high);
           sort(arr, pi-1, low);
           sort(arr, high, pi+1);
       }

   }

   int partition(int[] arr, int low, int high) {
       int pivot = arr[low];
       int i = high + 1;
       for(int j=high; j > low; j--) {
           if(arr[j] > pivot) {
               i--;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int temp = arr[i-1];
       arr[i-1] = arr[low];
       arr[low] = temp;
       return i-1;
   }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
