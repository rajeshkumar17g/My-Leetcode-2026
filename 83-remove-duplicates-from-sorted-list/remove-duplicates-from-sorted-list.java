
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode prev=head,crr=head.next;

        while(crr!=null){
            if(prev.val==crr.val){
                crr=crr.next;
            }
            else{
                prev.next=crr;
                crr=crr.next;
                prev=prev.next;
            }
        }
        prev.next=null;

        return head;


    }
}