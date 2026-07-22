/*
1. FInd middle of LL
2. Reverse 1st half
3. compare 1st & 2nd half

Note: Edge case of odd Nodes

*/
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
       if(fast!=null){ //odd number
        slow=slow.next;// skipping middle value
       }
       
       ListNode crr1=slow,crr2=rev_head;
       
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