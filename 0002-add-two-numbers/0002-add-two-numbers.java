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
import java.util.LinkedList;
import java.util.Scanner;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // create a dummy head
        ListNode head = new ListNode(0);
        ListNode current = head;
        int carry = 0;

        // loop while the next digit is not null
        while (l1 != null || l2 != null || carry > 0){
            // check whether the digit is null or not
            int digit1 = l1 != null ? l1.val : 0;
            int digit2 = l2 != null ? l2.val : 0;

            int sum = digit1 + digit2 + carry;

            // new digit after sum
            int newDigit = sum % 10;
            carry = sum / 10;

            // assign newDigit to the next pointer, pass current to newdigit
            current.next = new ListNode(newDigit);
            current = current.next;

            // pass l1 and l2 to the next digit
            if (l1 != null){
                l1 = l1.next;
            }
            if (l2 != null){
                l2 = l2.next;
            }
        }
        // return the next head onward
        return head.next;
    }
}