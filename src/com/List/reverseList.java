package com.List;
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode pre=null;
            ListNode cur=head;
            ListNode temp=null;
            while(cur!=null)
            {
                temp=cur.next;
                cur.next=pre;
                //顺序不能变
                pre=cur;
                cur=temp;
            }
            return pre;
        }
        public static void main(String[] args) {
            ListNode h=new ListNode(1,new ListNode(2,new ListNode(3)));
            ListNode res=new Solution().reverseList(h);
            for(;res!=null;res=res.next)System.out.print(res.val+" ");
        }
    }
