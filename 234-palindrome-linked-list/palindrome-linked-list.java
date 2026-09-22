
class Solution {
    public boolean isPalindrome(ListNode head) {
       
       ListNode slow=head,fast=head;
       while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
       } 

       ListNode crr=head,after,rev_head=null;
       while(crr!=slow){
            after=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=after;
       }

       // 
       ListNode crr1=rev_head;
       ListNode crr2=slow;
       //odd number of nodes
       if(fast!=null){
         crr2=slow.next;
       }

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