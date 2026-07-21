
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev=null;
        ListNode crr=head,after;
        while(crr!=null){
            after=crr.next;
            crr.next=rev;
            rev=crr;
            crr=after;
        }
        return rev;
    }
}