package com.Hash;
import java.util.HashMap;
import java.util.Map;
class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //使其不满足时返回[0,0]而不是空指针
        int[]res=new int[2];
        if(nums==null||nums.length==0)
        {
            return res;
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int temp=target-nums[i];
            if(map.containsKey(temp))
            {
                res[1]=i;
                res[0]=map.get(temp);
                break;
            }
            map.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] arr = {2,7,11,15};
        int[] ans = sol.twoSum(arr,9);
        System.out.println(ans[0]+" "+ans[1]);
    }
}