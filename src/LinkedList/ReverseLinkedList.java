/****************
Problem Statement:

Reverse a singly linked list.

Example:

Input: 1->2->3->4->5->NULL
Output: 5->4->3->2->1->NULL
Follow up:

A linked list can be reversed either iteratively or recursively. Could you implement both?

**********************/

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
        
                
        if(head == null || head.next == null)
            return head;
        
        ListNode next = null;
        ListNode curr = head;
        ListNode prev = null;
        
        
        while(current != null){
            
           next = curr.next; 
           curr.next = prev; 
           prev = curr; 
           curr = next; 
            
        }
        head = prev;
      return head;  
    }
}
