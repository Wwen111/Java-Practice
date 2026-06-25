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
class Solution1 {
    public ListNode swapPairs(ListNode head) {
        ListNode dumyhead=new ListNode(-1);
        dumyhead.next=head;
        ListNode cur=dumyhead;
        ListNode temp1,temp2,temp3;
        while(cur.next!=null&&cur.next.next!=null)
        {
            temp1=cur.next;
            temp3=cur.next.next.next;
            temp2=cur.next.next;
            cur.next=temp2;
            temp2.next=temp1;
            temp1.next=temp3;
            cur=temp1;
        }
        return dumyhead.next;
    }
    public static void main(String[] args) {
        // 构建链表 1->2->3->4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        Solution1 sol = new Solution1();
        ListNode res = sol.swapPairs(head);
        // 遍历打印
        for (; res != null; res = res.next) {
            System.out.print(res.val + " ");
        }
    }
}