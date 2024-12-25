package com.aditya.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selection(arr);
        System.out.print("Sorted Array: "+ Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr,0,last);
            swap(arr, max, last);
        }
    }

    public static void swap(int[] arr, int max, int last) {
        int temp = arr[last];
        arr[last] = arr[max];
        arr[max] = temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i = start+1; i <= end; i++) {
            if(arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
