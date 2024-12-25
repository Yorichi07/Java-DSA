package com.aditya.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubble(arr,n);
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
    public static void bubble(int[] arr,int n) {
        boolean swapped;
        for(int i=0;i<n;i++) {
            swapped = false;
            for(int j=1;j<n-i;j++) {
                if(arr[j]<arr[j-1]) {
                    swapped=true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
