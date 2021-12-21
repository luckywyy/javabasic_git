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
        while (head.next != null) {
            ListNode temp = new ListNode(0);
            head.next = temp;
            temp.next = head.next;
            head.
        }
        return null;
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