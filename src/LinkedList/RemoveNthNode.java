/***********************
Problem Statement:

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

************************/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int counter = length(head)-n+1;
        ListNode prev = head;
        ListNode curr = head;
        
        int index = 1;
        
        if(counter == 1 && n == 1)
            return null;
        
        while(head != null){
            if(counter == index){
                    if(counter == 1)
                        head = head.next;
                
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }
       return head;   
    }
    
    public int length(ListNode head){
        int len = 0;
        
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    } 
}
