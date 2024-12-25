//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
package com.aditya.Sorting;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int ans = missingNumber(arr);
        System.out.println("Missing number is: " + ans);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];

            //skip element with value equal to length of array because it's correct index is outofbound
            if (nums[i] == nums.length) {
                i++;
            } else if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;     //if all numbers are in place then nums.length will be missing
    }
}