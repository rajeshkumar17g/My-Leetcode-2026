class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode rev_head=null,crr=head,after;

        while(crr!=null){
            after=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=after;
        }

        return rev_head;






    }
}