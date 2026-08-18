class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy,crr=head;

        while(crr!=null && crr.next!=null){
            if(crr.next!=null && crr.val==crr.next.val){
                while(crr.next!=null && crr.val==crr.next.val){
                    crr=crr.next;
                }
                crr=crr.next;
                prev.next=crr;
            }
            else{
                prev.next=crr;
                prev=crr;
                crr=crr.next;
            }
        }
        return dummy.next;









    }
}