package com;

public class Test59 {
    public int[][] generateMatrix(int n) {
        int[][]nums=new int[n][n];
        int x=0;
        int y=0;
        int z=1;
        int q=1;
        int count=1;
        int i,j;
        while(q<=n/2)
        {
            for(j=y;j<n-z;j++)
            {
                nums[x][j]=count++;
            }
            for(i=x;i<n-z;i++)
            {
                nums[i][j]=count++;
            }
            for(;j>y;j--)
            {
                nums[i][j]=count++;
            }
            for(;i>x;i--)
            {
                nums[i][j]=count++;
            }
            x++;
            y++;
            z++;
            q++;
        }
        if(n%2==1)
        {
            nums[x][y]=count;
        }
        return nums;
    }
    public static void main(String[] args) {
        int n = 3;
        Test59 test = new Test59();
        int[][] nums= test.generateMatrix(n);
        //拼接相当于+
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            sb.append("[");
            for (int j = 0; j < nums[i].length; j++) {
                sb.append(nums[i][j]);
                if (j != nums[i].length - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
            if (i != nums.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb);
    }
}
