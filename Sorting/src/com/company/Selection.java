package com.company;

public class Selection {
    protected  static int[] intEle = new int[]{4,7,2,1,3};
    private IntWrapper arr[] = new IntWrapper[intEle.length];
    public Selection(){
        for (int i=0; i<arr.length; i++)
        this.arr[i] = new IntWrapper(intEle[i]);
    }

    public void swap(IntWrapper a, IntWrapper b){
        int temp =  a.value;
        a.value = b.value;
        b.value = temp;

    }
    public void sort(){
        int length = arr.length;
        for(int i=0; i< length-1; i++) {
            int max_index = i;
            for(int j = i+1; j<length; j++){
                if (arr[j].value < arr[max_index].value){
                    max_index = j;
                }
            }
//            IntWrapper a = new IntWrapper(arr[i]);
//            IntWrapper b = new IntWrapper(arr[max_index]);
//            System.out.println("Pehle");
//            for (int element: arr) {
//                System.out.print(element + " ");
//            }
            swap(arr[i],arr[max_index]);
//            arr[i] = a.value;
//            arr[max_index] = b.value;
//            System.out.println("Baad me");
//            for (int element: arr) {
//                System.out.print(element + " ");
//            }
//            int temp = arr[i];
//            arr[i] = arr[max_index];
//            arr[max_index] = temp;
        }
        for (IntWrapper element: arr) {
            System.out.print(element.value + " ");
        }

    }
    public class IntWrapper {
        int value;

        IntWrapper(int val){
            this.value = val;
        }
    }
}
