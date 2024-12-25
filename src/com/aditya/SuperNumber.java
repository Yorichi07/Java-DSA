package com.aditya;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements of queue: ");
        int N = sc.nextInt();
        int[] queue = new int[N];

        System.out.println("Enter the positive elements of queue: ");
        for (int i = 0; i < N; i++) {
            queue[i] = sc.nextInt();
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int sum = 0;
            int temp = queue[i];

            while (temp > 0) {
                int digit = temp % 10;
                sum += factorial(digit);
                temp = temp / 10;
            }

            if (sum == queue[i]) {
                result.add(queue[i]);
            }
        }

        System.out.println("Super numbers are: ");
        for (Integer superNum : result) {
            System.out.print(superNum + " ");
        }
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

