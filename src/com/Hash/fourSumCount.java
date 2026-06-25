package com.Hash;
import java.util.HashMap;
import java.util.Map;
class Solution3 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        //res为最后返回的个数
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums1)
        {
            for(int j:nums2)
            {
                int sum=i+j;
                //map.getOrDefault(sum,0)+1表示有过sum则加1，没有过则为0
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int i:nums3)
        {
            for(int j:nums4)
            {
                //有记录则加上sum出现的次数，没记录则加0
                res+=map.getOrDefault(0-i-j,0);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int[] n1 = {1,2}, n2 = {-2,-1}, n3 = {-1,2}, n4 = {0,2};
        int count = sol.fourSumCount(n1,n2,n3,n4);
        System.out.println("四数相加等于0的组合总数："+count);
    }
}
