class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        
        ListNode prev=dummy,crr=head;

        while(crr!=null && crr.next!=null){
            if(crr.val==crr.next.val){
                while(crr.next!=null && crr.val==crr.next.val){
                    crr=crr.next;
                }
                prev.next=crr.next;
                crr=crr.next;
            }
            else{
                prev=crr;
                crr=crr.next;
            }
        }


        return dummy.next;
    }
}