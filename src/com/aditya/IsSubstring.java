package com.aditya;

//To find out whether a string is a substring of another string or not.

import java.util.Scanner;

public class IsSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string: ");
        String str = sc.nextLine();
        System.out.println("Enter substring: ");
        String substr = sc.nextLine();

        int result = check(substr, str);
        if (result != -1) {
            System.out.printf("Substring found at %d", result + 1);
        } else {
            System.out.println("Substring not found");
        }

//        if(str.contains(substr)){
//            System.out.printf("IsSubstring found with starting index %d",);
//        }
//        else{
//            System.out.println("IsSubstring not found");
//        }
    }

    public static int check(String substr, String str) {
        int n = str.length();
        int m = substr.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
