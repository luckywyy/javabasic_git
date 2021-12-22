package top.yy.力扣.反转链表;

/**
 * @program: javabasic_git-top.yy.力扣.反转链表
 * @description:
 * @author:
 * @create: 2021-12-21 20:31
 **/
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

        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * 解法2 使用递归
     * 意义在于将大的链表不断缩小
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
//        3、现在考虑结束条件 首先最后一个节点不需要反转，因为在之前已经反转过，其次输入条件可能为空 这种情况直接返回本身
        if (head == null || head.next == null) {
            return head;
        }

//        要将当前节点进行反转，只要知道后续的反转链表即可，然后把后续的最后一个 也就是当前的下一个指向当前 当前节点指向空即可
//        1、因此可以写下第一段代码 反转当前的，需要先把后续的反转了 后续反转的头节点就是第一个节点
        ListNode node = reverseList(head.next);
//        2、现在第二段的代码，后续的已经反转的情况下，将后续的最后一个指向当前 当前的指向空
        head.next.next = head;
        head.next = null;

        return node;
    }

    public static void main(String[] args) {

    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}