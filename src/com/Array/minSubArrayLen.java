package com.Array;

public class minSubArrayLen {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int number=Integer.MAX_VALUE;
        for(int i=0,j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                number=Math.min(number,j-i+1);
                sum-=nums[i++];
            }
        }
        return number==Integer.MAX_VALUE ? 0:number;
    }
    public static void main(String[] args) {
        minSubArrayLen obj = new minSubArrayLen();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        int res = obj.minSubArrayLen(target, nums);
        System.out.println("满足条件最短子数组长度：" + res);
    }
}

