package com.Hash;

class Solution {
    public boolean isAnagram(String s, String t) {
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            //减去a的ASCII码值使其变成0，节省空间
            hash[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            hash[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(hash[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        //测试用例1：是字母异位词
        String s1 = "anagram", t1 = "nagaram";
        System.out.println(sol.isAnagram(s1, t1));
        //测试用例2：不是字母异位词
        String s2 = "rat", t2 = "car";
        System.out.println(sol.isAnagram(s2, t2));
    }
}
