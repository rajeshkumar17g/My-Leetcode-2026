class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      ListNode dummy=new ListNode(0,head);
      ListNode prev=dummy;  
      ListNode crr=head;
      while(crr!=null && crr.next!=null){
            if(crr.val!=crr.next.val){
                prev=prev.next;
                crr=crr.next;
            }
            else{
                while(crr!=null && crr.next!=null && crr.val==crr.next.val){
                    crr=crr.next;
                }
                prev.next=crr.next;
                crr=crr.next;
            }
      }


      return dummy.next;
    }
}