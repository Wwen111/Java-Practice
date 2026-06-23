package com.List;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class removeElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode cur=dummy;
        while(cur!=null&&cur.next!=null)
        {
            if(cur.next.val==val)
            {
                cur.next=cur.next.next;
            }
            else
            {
                cur=cur.next;
            }
        }
        return dummy.next;
    }
    public void printList(ListNode head) {
        ListNode p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    // 主方法：程序入口
    public static void main(String[] args) {
        removeElements test = new removeElements();

        // 构造测试链表：1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("删除前：");
        test.printList(head);

        // 删除值为 6 的节点
        ListNode newHead = test.removeElements(head, 6);

        System.out.println("删除后：");
        test.printList(newHead);
    }
}
