package com.Hash;
import java.util.HashSet;
import java.util.Set;
class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1==null||nums1.length==0||nums2==null||nums2.length==0)
        {
            return new int[0];
        }
        //创建整数哈希表集合
        Set<Integer> set1=new HashSet<>();
        Set<Integer> resSet=new HashSet<>();
        for(int i:nums1)
        {
            set1.add(i);
        }
        for(int i:nums2)
        {
            if(set1.contains(i))
            {
                resSet.add(i);
            }
        }
        //用int型数组arr存放集合resSet
        int[] arr=new int[resSet.size()];
        int j=0;
        for(int i:resSet)
        {
            arr[j++]=i;
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] a = {1,2,2,1};
        int[] b = {2,2};
        int[] ans = sol.intersection(a,b);
        //遍历打印交集结果
        for(int num : ans) System.out.print(num+" ");
    }
}