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
class Solution2{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=dummy;
        ListNode slow=dummy;
        for(int i=0;i<=n;i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null)
        {
            slow.next=slow.next.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        //造链表 1->2->3->4->5
        ListNode h = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode ans = new Solution2().removeNthFromEnd(h,2);
        for(;ans!=null;ans=ans.next) System.out.print(ans.val+" ");
    }
}
