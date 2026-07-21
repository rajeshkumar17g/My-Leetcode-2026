/*
1. find middle of LL
2. rev ll from head to middle
3. compare 1st rev with second half (slow)
*/
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode rev=null,after,crr=head;
        while(crr!=slow){
            after=crr.next;
            crr.next=rev;
            rev=crr;
            crr=after;
        }

        if(fast!=null){ // odd no of values , middle belongs to both the halfs , so skip it
            slow=slow.next;
        }

        ListNode crr1=rev;
        ListNode crr2=slow;
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