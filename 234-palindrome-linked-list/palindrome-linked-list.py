class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow=head
        fast=head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
        
        rev_head=None
        crr=head
        while crr!=slow:
            after=crr.next
            crr.next=rev_head
            rev_head=crr
            crr=after
        
        if fast!=None:
            slow=slow.next

        crr1=rev_head
        crr2=slow
        while crr1!=None and crr2!=None:
            if crr1.val!=crr2.val:
                return False
            crr1=crr1.next
            crr2=crr2.next
        return True