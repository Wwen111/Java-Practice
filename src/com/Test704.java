package com;

public class Test704 {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int n=(right-left)/2+left;
            int m=nums[n];
            if(m>target)
            {
                right=n-1;
            }
            else if(m<target)
            {
                left=n+1;
            }
            else{
                return n;
            }
        }
        return -1;
    }
}
