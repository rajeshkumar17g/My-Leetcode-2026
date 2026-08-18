class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode crr=head.next,prev=head;
        while(crr!=null){
            if(prev.val!=crr.val){
                prev.next=crr;
                prev=crr;
            }
            crr=crr.next;
        }
        prev.next=null;

        return head;
    }
}