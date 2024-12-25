package com.aditya;
import java.util.Arrays;
import java.util.Scanner;

public class ZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i =0;i<N;i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroesToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex]=arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }
}
