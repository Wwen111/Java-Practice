package com.Hash;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution5 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        for(int k=0;k<nums.length;k++)
        {
            //剪枝处理
            if(nums[k]>target&&nums[k]>=0)
            {
                break;
            }
            //去重
            if(k>0&&nums[k]==nums[k-1])
            {
                continue;
            }
            for(int i=k+1;i<nums.length;i++)
            {
                //二次剪枝
                if(nums[k]+nums[i]>target&&nums[k]+nums[i]>=0)
                {
                    break;
                }
                //去重
                if(i>k+1&&nums[i]==nums[i-1])
                {
                    continue;
                }
                int left=i+1;
                int right=nums.length-1;
                while(left<right)
                {
                    long sum=(long)nums[k]+nums[i]+nums[left]+nums[right];
                    if(sum>target)
                    {
                        right--;
                    }
                    else if(sum<target)
                    {
                        left++;
                    }
                    else
                    {
                        result.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
                        //去重
                        while(right>left&&nums[right]==nums[right-1])right--;
                        while(right>left&&nums[left]==nums[left+1])left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        List<List<Integer>> res1 = solution.fourSum(nums1, target1);
        System.out.println("nums = [1,0,-1,0,-2,2], target = 0 结果：");
        System.out.println(res1);
    }
}
