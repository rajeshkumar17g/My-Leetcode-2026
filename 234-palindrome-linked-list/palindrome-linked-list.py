# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow=head
        fast=head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
    
        rev=None
        crr=head
        while crr!=slow:
            after=crr.next
            crr.next=rev
            rev=crr
            crr=after
        
        crr1=rev
        if fast!=None:
            crr2=slow.next
        else:
            crr2=slow
        
        while crr1!=None:
            if crr1.val!=crr2.val:
                return False
            crr1=crr1.next
            crr2=crr2.next
        
        return True