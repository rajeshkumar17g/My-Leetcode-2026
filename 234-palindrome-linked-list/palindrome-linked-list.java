class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode l1,l2;
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

        l1=rev_head;

        //even or odd
        if(fast!=null){
            //odd
            l2=slow.next;
        }
        else{
            l2=slow;
        }

        while(l1!=null && l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;

    }
}
/*
1. find middle of LL
2. determine even or odd number of elements
3. reverse the first half <slow
4. depending on even or odd, select your starting point of
5. compare


*/