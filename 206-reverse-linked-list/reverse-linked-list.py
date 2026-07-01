# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        crr=head
        rev_head=None
        while crr!=None:
            after=crr.next
            crr.next=rev_head
            rev_head=crr
            crr=after
        return rev_head






