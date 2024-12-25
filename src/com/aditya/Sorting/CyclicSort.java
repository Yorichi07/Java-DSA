package com.aditya.Sorting;

import java.util.Arrays;
import static com.aditya.Sorting.SelectionSort.swap;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclic(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
}
