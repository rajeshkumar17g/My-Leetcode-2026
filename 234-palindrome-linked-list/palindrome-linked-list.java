/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * 
 
 
 
 }

1. middle 
2. 1st half reverse upto middle
3. check 1st half and 2nd half

Note: fast!=null=> odd number => skip mid for crr2 



 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head,fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode rev_head=null,after,crr=head;

        while(crr!=slow){
            after=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=after;
        }

        if(fast!=null){
            slow=slow.next;
        }

       ListNode crr1=rev_head,crr2=slow;
       while(crr1!=null && crr2!=null){
            if(crr1.val!=crr2.val){
                return false;
            }
            crr1=crr1.next;
            crr2=crr2.next;
       }
       return true;






    }
}