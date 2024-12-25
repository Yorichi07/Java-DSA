package com.aditya;

import java.util.Scanner;

public class sumOfDigitsPresentInString {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = sc.nextLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.parseInt(str.substring(i, i + 1));
            }
        }
        System.out.printf("The sum of digits in the string is %d.", sum);
    }
}
