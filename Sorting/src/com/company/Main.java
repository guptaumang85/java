package com.company;

public class Main {

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        obj.sort(arr, arr.length-1,0 );
        QuickSort.printArray(arr);
//        int[] arr = new int[]{1,2,3,4};
//        System.out.println(arr);
	// write your code here
    }
}
