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
        
        ListNode slow=head,fast=head;
        //move n steps
        int count=0;
        while(count<n){
            count++;
            fast=fast.next;
        }
       // System.out.println("Fast: "+fast.val);
       if(fast==null){
           return head.next;
       }

       while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
       }

       //System.out.println("Fast: "+fast.val+" Slow: "+slow.val);
        slow.next=slow.next.next;

        return head;
    }
}