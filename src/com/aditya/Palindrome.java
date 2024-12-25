package com.aditya;

public class Palindrome {
    public static void main(String[] args) {
        String check = "abcdcbfa";

//        method 1 using reverse
//        StringBuilder builder = new StringBuilder(check);
//        if(builder.reverse().toString().equals(check)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not Palindrome");
//        }

        char[] ch = check.toCharArray();
        int start = 0;
        int end = ch.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (ch[start] != ch[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
