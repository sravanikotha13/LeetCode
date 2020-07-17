/*******

Problem Statement:

Design your implementation of the linked list. You can choose to use the singly linked list or the doubly linked list. A node in a singly linked list should have two attributes: val and next. val is the value of the current node, and next is a pointer/reference to the next node. If you want to use the doubly linked list, you will need one more attribute prev to indicate the previous node in the linked list. Assume all nodes in the linked list are 0-indexed.

Implement these functions in your linked list class:

get(index) : Get the value of the index-th node in the linked list. If the index is invalid, return -1.
addAtHead(val) : Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
addAtTail(val) : Append a node of value val to the last element of the linked list.
addAtIndex(index, val) : Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
deleteAtIndex(index) : Delete the index-th node in the linked list, if the index is valid.
 

Example:

Input: 
["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[1],[1]]
Output:  
[null,null,null,null,2,null,3]

Explanation:
MyLinkedList linkedList = new MyLinkedList(); // Initialize empty LinkedList
linkedList.addAtHead(1);
linkedList.addAtTail(3);
linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
linkedList.get(1);            // returns 2
linkedList.deleteAtIndex(1);  // now the linked list is 1->3
linkedList.get(1);            // returns 3
 

Constraints:

0 <= index,val <= 1000
Please do not use the built-in LinkedList library.
At most 2000 calls will be made to get, addAtHead, addAtTail,  addAtIndex and deleteAtIndex.



************/

class MyLinkedList {

    int length;
    Node head;
    
    class Node{
        
        int data;
        Node next;
        
        Node(int value){
            this.data = value;
            this.next = null;
        }
    }
    
    /** Initialize your data structure here. */
    public MyLinkedList() {
        this.length = 0;
        this.head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        
        int counter = 0;
        Node curr = this.head;
        
        if(index<0 || index>this.length)
            return -1;
        else{
            
            while(counter != index){
                curr = curr.next;
                counter++;
            }
        }      
        
        return curr!=null?curr.data:-1;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        
        Node newNode = new Node(val);
        newNode.next = this.head;
        this.head = newNode;
        this.length++;  
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
         if(length == 0){
            addAtHead(val);
            return;
        }
        else
        {
            Node curr = this.head;
            Node newNode = new Node(val);
            newNode.next = null;
            
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
            this.length++;
        }     
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        Node newNode = new Node(val);
        int counter = 0;
        
        Node curr = this.head;
        
        
        if(index == 0)
        {
            addAtHead(val);
            return;
        }
        else if(index == this.length){
            addAtTail(val);
            return;
        }
        else if(index<0 || index > this.length)
            return;
        else
        {
        	while(counter != (index-1)){
        		curr = curr.next;
        		counter++;
        	}
        	newNode.next = curr.next;
        	curr.next = newNode;
        	this.length++;
        }        
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        
        Node curr = head;
        int counter = 0;
        if(index == 0){
            this.head = head.next;
            this.length--;
        }
        else{
            
            Node pre = null;
            while(counter != index) {
                pre = curr;
                curr = curr.next;
                counter++;
            }
            if(curr != null){
                pre.next = curr.next;
                this.length--;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */






