
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        System.out.println(fast.val);
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
        slow.next=slow.next.next;
        return head;
    }
}