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
    public static void main(String[] args) {
        Test704 t = new Test704();
        int[] arr={1,3,5,7,9};
        int res = t.search(arr,5);
        System.out.println("查到下标："+res);
    }
}
