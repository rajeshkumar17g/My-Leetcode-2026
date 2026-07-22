
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode crr=head,after,rev_head=null;
        while(crr!=null){
            after=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=after;
        }
        return rev_head;









    }
}