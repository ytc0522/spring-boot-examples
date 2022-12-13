package com.example.advanced.algorithm;

public class 局部峰值 {


    public static int findElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int mid2 = mid +1;
            if (nums[mid] < nums[mid2]) {
                low = mid2;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4};
        int element = findElement(nums);
        System.out.println("element = " + element);
    }

}
