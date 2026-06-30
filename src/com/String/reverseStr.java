package com.String;

class Solution1 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i += 2 * k)
        {
            int start = i;
            // 判断尾数够不够k个来取决end指针的位置
            int end = Math.min(ch.length - 1,start + k - 1);
            while(start < end)
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.printf("输入：%s, k=%d → 输出：%s%n", s1, k1, solution.reverseStr(s1, k1));
    }
}
