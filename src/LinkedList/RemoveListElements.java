/***********************
Problem Statement:

Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5


*******************/

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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head == null)
            return null;
        
        while((head.val == val))
        {
            head = (head.next == null)?null:head.next;
            if(head == null)
                return null;
        }
        
        ListNode prev = head;
        ListNode current = head;
        
        while(current != null){
            
           if(current.val == val){
                prev.next = current.next;
            }
            else
            {
                prev = current;
            }
            current = current.next;
        }
        
        return head;        
    }
}
