/**********************************************************************************
 * Source - https://leetcode.com/problems/add-two-numbers/
 * Description
    * You are given two non-empty linked lists representing two non-negative integers.
    * The digits are stored in reverse order, and each of their nodes contains a single digit.
    * Add the two numbers and return the sum as a linked list.
    * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Examples
    * Example 1:
        Input: l1 = [2,4,3], l2 = [5,6,4]
        Output: [7,0,8]
        Explanation: 342 + 465 = 807.
    * Example 2:
        Input: l1 = [0], l2 = [0]
        Output: [0]
    * Example 3:
        Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        Output: [8,9,9,9,0,0,0,1]
 ***********************************************************************************/
package Easy_1;

import java.math.BigInteger;

public class Add_Two_Numbers {
    private static class ListNode {
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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new ListNode(addTwoNumbers(l1, l2).val);
        System.out.println(result.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder numberOne = new StringBuilder(String.valueOf(l1.val));
        StringBuilder numberTwo = new StringBuilder(String.valueOf(l2.val));

        while (l1.next != null) {
            numberOne.insert(0, l1.next.val);
            l1 = l1.next;
        }

        while (l2.next != null) {
            numberTwo.insert(0, l2.next.val);
            l2 = l2.next;
        }

        BigInteger n1 = new BigInteger(String.valueOf(numberOne));
        BigInteger n2 = new BigInteger(String.valueOf(numberTwo));
        BigInteger n3 = n1.add(n2);
        StringBuilder result = new StringBuilder(String.valueOf(n3));
        result.reverse();

        ListNode l3 = null;
        for (int i = 0; i < result.length(); i++) {
            String temp = "";
            temp += result.charAt(i);
            int asd = Integer.parseInt(temp);
            l3 = addLast(l3, asd);
        }

        return l3;
    }

    private static ListNode addLast(ListNode header, int x) {
        ListNode ret = header;

        if (header == null) {
            return new ListNode(x, null);
        }

        while ((header.next != null)) {
            header = header.next;
        }

        header.next = new ListNode(x, null);
        return ret;
    }
}
