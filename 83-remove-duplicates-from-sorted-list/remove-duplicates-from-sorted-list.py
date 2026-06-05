# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return head
        prev=head
        crr=head.next
        while crr!=None:
            if prev.val==crr.val:
                crr=crr.next
            else:
                prev.next=crr
                prev=crr
                crr=crr.next
        prev.next=None
        return head