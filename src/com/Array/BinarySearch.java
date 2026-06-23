package com.Array;

public class BinarySearch {
    public int removeElement(int[] nums, int val) {
        int slow=0;
        for(int fast=0;fast<nums.length;fast++)
        {
            if(nums[fast]!=val)
            {
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        int[] arr = {3,2,2,3};
        int res = obj.removeElement(arr,3);
        System.out.println("新数组长度："+res);
    }
}

