package com;

public class Test977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int pos = result.length - 1;
        int right = nums.length - 1;
        int left = 0;
        while (left <= right) {
            if (nums[left] * nums[left] > nums[right] * nums[right]) {
                result[pos] = nums[left] * nums[left];
                pos--;
                left++;
            } else {
                result[pos] = nums[right] * nums[right];
                pos--;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Test977 obj = new Test977();
        int[] arr = {-4, -1, 0, 3, 10};
        int[] ans = obj.sortedSquares(arr);
        System.out.print("平方排序结果：");
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}