package com.aditya.Sorting;

import java.util.Arrays;

import static com.aditya.Sorting.SelectionSort.swap;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}
