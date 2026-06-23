package com.Array;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int right=s.length()-1;
        int sum=0;
        while(s.charAt(right)==' ')
        {
            right--;
        }
        while(right>=0&&s.charAt(right)!=' ')
        {
            sum+=1;
            right--;
        }
        return sum;
    }
    public static void main(String[] args) {
        lengthOfLastWord test = new lengthOfLastWord();

        // 多组测试用例
        String str1 = "Hello World";

        System.out.println("\"" + str1 + "\" 最后单词长度：" + test.lengthOfLastWord(str1));
    }
}
